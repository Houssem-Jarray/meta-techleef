SUMMARY = "C Hello world application for Techleef"
DESCRIPTION = "This recipe builds a simple C application that prints 'Hello Techleef' to the console."
HOMEPAGE = ""
SECTION = "apps"

LICENSE = "CLOSED"

SRC_URI = "git://github.com/bhstalel/yocto-hello-c-makefile;protocol=https;branch=main"
SRCREV = "c0b0245eed82bdf16cdefc76bb821917b9996dfb"

# fix S to point to the correct directory 
S = "${WORKDIR}/git"

DEPENDS += "hellolib"


