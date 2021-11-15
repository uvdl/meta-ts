# adapted from linux-imx.inc, copyright (C) 2012-2013 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux kernel provided and supported by Technologic Systems"
DESCRIPTION = "Linux kernel provided and supported by Technologic Systems (based on the kernel provided by NXP). \
It includes support for many IPs such as GPU, VPU and IPU."

include linux-technologic.inc
require recipes-kernel/linux/linux-imx.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

DEPENDS += "lzop-native bc-native"

LOCALVERSION_ts4900 = "-ts_4900"
LOCALVERSION_ts7180 = "-ts_7180"

SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"

COMPATIBLE_MACHINE = "(ts4900|ts7180)"