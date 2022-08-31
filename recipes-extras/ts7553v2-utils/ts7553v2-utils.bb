SUMMARY = "TS-7553v2 Utils"
DESCRIPTION = "Technologic Systems utilities for the TS-7553v2"
AUTHOR = "Mark Featherston <mark@embeddedarm.com>"
HOMEPAGE = "http://www.embeddedarm.com/"
SECTION = "base"

LICENSE = "CLOSED"
DEPENDS = "libgpiod cairo"

FILESEXTRAPATH_prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/embeddedarm/ts7553v2-utils.git;branch=master "

SRCREV = "975eebed26d0fa507db9a0c5e2735434985f8d70"

S = "${WORKDIR}/git"

inherit autotools
