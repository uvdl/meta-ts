LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

UBOOT_SRC ?= "git://github.com/embeddedarm/u-boot-imx.git;protocol=git"

# SRCBRANCH = "tsimx_v2016.03_4.1.15_2.0.0_ga"
SRCBRANCH = "lionel/v2020.01-ts+ts7180"
# SRCREV = "b4662ed63eca8162e3709b96d54191b298a9e711"
SRCREV = "f4dda1e990dae40bbbf8efe035f4efc45cd2f30e"

S = "${WORKDIR}/git"