SUMMARY = "Techleef - A Meta Layer for Techleef Projects"
DESCRIPTION = "This is a meta layer for Techleef projects, providing recipes and configurations for building thechleef simple applications."
HOMEPAGE = ""
LICENSE = "CLOSED"

SRC_URI = "file://techleef.c;subdir=techleef"

S = "${WORKDIR}/techleef"

PACKAGES += "${PN}-demo"

do_compile(){
    ${CC} techleef.c ${LDFLAGS} -o techleef
}

do_install(){
    install -d ${D}/usr/bin
    install -m 0774 techleef ${D}/usr/bin
}

FILES:${PN}-demo = "/usr/bin/*"