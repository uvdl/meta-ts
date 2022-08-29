SUMMARY = "TS-7553v2 Utils"
DESCRIPTION = "Technologic Systems utilities for the TS-7553v2"
AUTHOR = "Mark Featherston <mark@embeddedarm.com>"
HOMEPAGE = "http://www.embeddedarm.com/"
SECTION = "base"

LICENSE = "CLOSED"
DEPENDS = "libgpiod"

FILESEXTRAPATH_prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/embeddedarm/ts7553v2-utils.git;branch=master "

#SRCREV = "f4827ab4a3f3c1f5f555de57af05168300892bb3"

S = "${WORKDIR}/git"

inherit autotools
