FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SUMMARY = "U-Boot for Technologic Systems"
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"
DEPENDS += "bison-native bc-native dtc-native"

include u-boot-common.inc

SRC_URI += "${UBOOT_SRC}"

do_install_append_ts7553v2(){
    cp -f $S/../u-boot.imx $S/../../../../deploy/images/ts7553v2/
}

COMPATIBLE_MACHINE = "(ts7180|ts7553v2)"