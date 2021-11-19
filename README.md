meta-ts
=======
This layer adds Technologic Systems board support for the i.MX6.

The following expects to be used in a build system like the [ORNL Yocto Layer](https://github.com/uvdl/yocto-ornl)

## Create an SDcard

The instructions come from the [TS-7180 Manual](https://docs.embeddedarm.com/TS-7180#Backup_.2F_Restore).  I think in 
the future we will want to automate this, but for now its just a few instructions to follow.

**NOTES**
- Use whatever image you need for this (dev, min, or prod).

First build the image.  Export or edit the Makefile to set all the environment variables correctly then run the 
following commands.

<pre>
make environment
(wait to finish)
make build
(wait to finish, will take a lengthy amount of time)
make archive
(wait to finish, if S3 bucket is required make sure you have internet access)
</pre>

#### `linuxsystembuilder.ornl.gov`

When using the Cades VM (or an AWS instance to build), you will need to copy the archive file back to your local
machine in order to put it on an SD card.  Typical to use WinSCP (if you are in Windows or the following command if you 
are in Linux) **if** you are not using an S3 bucket.

<pre>
scp -r -i cadescloudvm.pem cades@linuxsystembuilder.ornl.gov:/opt/yocto-ornl-YYYY-MM-DD_HHMM .
</pre>

Once you have the *tar.gz* file, put an SD card in to your computer with whever adapter you want.  It needs to be a
single partition as these instructions expect that.  Once inserted either look at */dev/* or use *dmesg*.  The 
following is an example *dmesg* command.

<pre>
dmesg | tail -3
</pre>

Which will give you something like:
```
6ov@uvdl3:~/opt/cades/yocto-ornl-2021-06-22_1603$ dmesg | tail -3
[18601.606923] sd 11:0:0:1: [sde] 31457280 512-byte logical blocks: (16.1 GB/15.0 GiB)
[18601.612617]  sde: sde1 sde2
[18602.243590] EXT4-fs (sde2): mounted filesystem with ordered data mode. Opts: (null)
```

Once you have verified the device file you are working with use the following commands to create your bootable SD card.

```
# verify nothing else has this mounted
sudo umount /dev/sdx1

sudo mkfs.ext4 -O ^metadata_csum,^64bit /dev/sdx1
sudo mkdir /mnt/sd
sudo mount /dev/sdx1 /mnt/sd/
sudo tar -xf THE-IMAGE-YOU-CREATED.tar.gz -C /mnt/sd
sudo umount /mnt/sd
sync
```

## Flash SD To eMMC

### TBD


See our repo for more information:
https://github.com/embeddedarm/ts-oe-bsp
