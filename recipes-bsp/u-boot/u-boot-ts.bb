FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SUMMARY = "U-Boot for Technologic Systems TS-7180"
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"
DEPENDS += "bc-native dtc-native"

include u-boot-common.inc
#inherit fsl-u-boot-localversion
# LOCALVERSION ?= "-${SRCBRANCH}"
SRC_URI += "${UBOOT_SRC};branch=${SRCBRANCH} \
    file://fw_env.config \
"

COMPATIBLE_MACHINE = "(ts7180)"