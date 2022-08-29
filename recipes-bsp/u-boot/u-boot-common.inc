LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

UBOOT_SRC ?= "git://github.com/embeddedarm/u-boot-imx.git;protocol=git"

SRCBRANCH_append_ts7180 = "lionel/v2020.01-ts+ts7180"
SRCREV_append_ts7180 = "f4dda1e990dae40bbbf8efe035f4efc45cd2f30e"

SRCBRANCH_append_ts7553v2 = "imx_v2015.04_3.14.52_1.1.0_ga"
SRCREV_append_ts7553v2 = "ef0f64b4308b8cb4080364e4d595ae841d679c80"

S = "${WORKDIR}/git"