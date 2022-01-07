SUMMARY = "TS-7180 Utils"
DESCRIPTION = "Technologic Systems utilities, gpioctl, tshwctl, nvramctl"
AUTHOR = "Mark Featherston <mark@embeddedarm.com>"
HOMEPAGE = "http://www.embeddedarm.com/"
SECTION = "base"

LICENSE = "CLOSED"
DEPENDS = "libgpiod"

FILESEXTRAPATHS_prepend := "${THISDIR}:"

SRC_URI = "git://github.com/embeddedarm/ts7180-utils.git;branch=master \
    file://utils.patch \
"

SRCREV = "f4827ab4a3f3c1f5f555de57af05168300892bb3"

S = "${WORKDIR}/git"

inherit autotools

do_install_append() {
    mkdir -p ${D}/usr/local/bin
    install -d ${D}/usr/local/bin

    cp -rf ${S}/src/tshwctl ${D}/usr/local/bin/tshwctl
    cp -rf ${S}/src/silabs ${D}/usr/local/bin/silabs
}
