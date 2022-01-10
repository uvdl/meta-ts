SUMMARY = "TS-SILOMON recipe.  Places script and service file in correct locations"
SECTION = "misc"
LICENSE = "CLOSED"

FILESEXTRAPATH_prepend := "${THISDIR}/${PN}:"

SRC_URI = " \
    file://tssilomon \
    file://tssilomon.service \
"

S="${WORKDIR}"

FILES_${PN} += " \
    /lib/systemd/system/tssilomon.service \
"

FILES_${PN} += " \
    /usr/local/bin/tssilomon \
"

do_install() {
    mkdir -p ${D}/usr/local/bin
    install -d ${D}/usr/local/bin

    cp -rf ${S}/tssilomon ${D}/usr/local/bin/tssilomon

    if ${@bb.utils.contains('DISTRO_FEATURES','systemd','true','false',d)}; then
        install -d ${D}${systemd_unitdir}/system
        install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants
        install -m 0644 ${WORKDIR}/tssilomon.service ${D}${systemd_unitdir}/system
        ln -sf ${systemd_unitdir}/system/tssilomon.service \
            ${D}${sysconfdir}/systemd/system/multi-user.target.wants/tssilomon.service
    fi
}
