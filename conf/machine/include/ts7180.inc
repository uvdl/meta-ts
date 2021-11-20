include conf/machine/include/imx-base.inc
include conf/machine/include/tune-cortexa7.inc

MACHINE_FEATURES += " pci wifi"

PREFERRED_PROVIDER_virtual/kernel ?= "linux-technologic"
PREFERRED_VERSION_linux-technologic ?= "4.9.280"
PREFERRED_PROVIDER_u-boot = "u-boot-ts"
PREFERRED_PROVIDER_virtual/bootloader = "u-boot-ts"

SERIAL_CONSOLE = "115200 ttymxc0"

KERNEL_IMAGETYPE = "zImage"
KERNEL_DEVICETREE = "imx6ul-ts7180.dtb"

IMAGE_INSTALL += " kernel-devicetree"
IMAGE_FSTYPES += "tar.gz"

UBOOT_CONFIG = "sd"
UBOOT_CONFIG[sd] = "ts7180_defconfig,sdcard"