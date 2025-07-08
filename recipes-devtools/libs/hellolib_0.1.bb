SUMMARY = "Hello library"
DESCRIPTION = "HelloLib - for techleef project, to manage dependencies in Yocto"
SECTION = "libs"
HOMEPAGE = ""
LICENSE = "CLOSED"

SRC_URI = "git://github.com/bhstalel/yocto-hello-c-dependency.git;protocol=https;branch=main"
SRCREV = "33e4b827e21d93ba34469cda81864d7d903bab98"

S = "${WORKDIR}/git"

do_install(){
    install -d ${D}/${includedir}
    install -d ${D}/${libdir}

    ln -sf libhello.so.1.0 ${D}/${libdir}/libhello.so

    install -m 0600 hellolib.h ${D}/${includedir}
    install -m 0700 lib*so.* ${D}/${libdir}
    cp libhello.so ${D}/${libdir}
}



