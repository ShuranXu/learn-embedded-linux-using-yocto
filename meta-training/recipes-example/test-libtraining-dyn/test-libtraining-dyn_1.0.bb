DESCRIPTION = "Simple program to test dynamic library"
SECTION = "examples"
LICENSE = "CLOSED"
DEPENDS = "libtraining-dyn"

SRC_URI = "file://test-libtraining-dyn.c"
S = "${WORKDIR}"

INSANE_SKIP_${PN} = "ldflags"

do_compile(){
    ${CC} -o test-libtraining-dyn test-libtraining-dyn.c -ltraining
}

do_install(){
    install -d ${D}${bindir}
    install -m 0755 test-libtraining-dyn ${D}${bindir}
}
