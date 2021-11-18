FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRCBRANCH = "tsimx_v2016.03_4.1.15_2.0.0_ga"
SRCREV = "b4662ed63eca8162e3709b96d54191b298a9e711"

# special fix for raspberrypi-cm3
SRC_URI = " \
    git://github.com/embeddedarm/u-boot-imx.git;protocol=git;branch=${SRCBRANCH} \
    file://fw_env.config \
"
