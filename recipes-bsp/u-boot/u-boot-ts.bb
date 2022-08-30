FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SUMMARY = "U-Boot for Technologic Systems TS-7180"
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"
DEPENDS += "bison-native bc-native dtc-native"

include u-boot-common.inc

SRC_URI += "${UBOOT_SRC} \
    file://fw_env.config \
"

COMPATIBLE_MACHINE = "(ts7180|ts7553v2)"