SUMMARY = "TS-7180 Utils"
DESCRIPTION = "Technologic Systems utilities, gpioctl, tshwctl, nvramctl"
AUTHOR = "Mark Featherston <mark@embeddedarm.com>"
HOMEPAGE = "http://www.embeddedarm.com/"
SECTION = "base"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
DEPENDS = ""

FILESEXTRAPATHS_prepend := "${THISDIR}:"

SRC_URI = "git://github.com/embeddedarm/ts7180-utils.git;branch=master"

SRCREV = "f4827ab4a3f3c1f5f555de57af05168300892bb3"
PV = "0.99.0+git${SRCPV}"

S = "${WORKDIR}/git"

inherit autotools
