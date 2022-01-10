SUMMARY = "TS-7180 Utils"
DESCRIPTION = "Technologic Systems utilities, gpioctl, tshwctl, nvramctl"
AUTHOR = "Mark Featherston <mark@embeddedarm.com>"
HOMEPAGE = "http://www.embeddedarm.com/"
SECTION = "base"

LICENSE = "CLOSED"
DEPENDS = "libgpiod"

FILESEXTRAPATH_prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/embeddedarm/ts7180-utils.git;branch=master \
    file://utils.patch \
"

SRCREV = "f4827ab4a3f3c1f5f555de57af05168300892bb3"

S = "${WORKDIR}/git"

inherit autotools

# Stock image has these two bins in usr/local/bin, this just matches that
do_install_append() {
    mkdir -p ${D}/usr/local/bin
    install -d ${D}/usr/local/bin

    install -m 0755 ${S}/../build/src/tshwctl ${D}/usr/local/bin/tshwctl
    install -m 0755 ${S}/../build/src/silabs ${D}/usr/local/bin/silabs
}
