LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCREV_ts7180 = "f4dda1e990dae40bbbf8efe035f4efc45cd2f30e"
SRCREV_ts7553v2 = "0ec2a019117bb2d59b9672a145b4684313d92782"
UBOOT_SRC_append_ts7180 ?= " \
    git://github.com/embeddedarm/u-boot-imx.git;protocol=git;branch=lionel/v2020.01-ts+ts7180 \
    file://fw_env.config \    
"
UBOOT_SRC_append_ts7553v2 ?= " \
    git://github.com/embeddedarm/u-boot-imx.git;protocol=git;branch=imx_v2016.03_4.1.15_2.0 \
    file://u-boot.imx \    
"

S = "${WORKDIR}/git"