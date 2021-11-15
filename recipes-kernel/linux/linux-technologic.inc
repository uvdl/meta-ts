# Adapted from linux-imx.inc, copyright (C) 2012, 2013 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux kernel for Technologic Systems boards"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

LINUX_VERSION_ts7180 = "4.9.280"
LINUX_VERSION_ts4900 = "3.10.17"

SRCBRANCH_ts7180 = "v4.9.280.ts"
SRCBRANCH_ts4900 = "master"

SRCREV_ts7180 = "fcc71412f6ab82308b4cacb77e5053796c41bb4e"

KERNEL_SRC_ts7180 = "git://github.com/embeddedarm/linux-4.9.y.git;protocol=git"
KERNEL_SRC_ts4900 = "git://github.com/embeddedarm/linux-3.10.17-imx6.git;protocol=git"
