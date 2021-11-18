FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += "bison-native bc-native dtc-native"

SRCBRANCH = "tsimx_v2016.03_4.1.15_2.0.0_ga"
SRCREV = "b4662ed63eca8162e3709b96d54191b298a9e711"

# special fix for raspberrypi-cm3
SRC_URI = " \
    git://github.com/embeddedarm/u-boot-imx.git;protocol=git;branch=${SRCBRANCH} \
    file://fw_env.config \
"
