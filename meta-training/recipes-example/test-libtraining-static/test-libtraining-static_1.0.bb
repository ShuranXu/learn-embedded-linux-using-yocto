DESCRIPTION = "Application that uses libtraining-static library"
SECTION = "examples"
LICENSE = "CLOSED"

DEPENDS = "libtraining-static"
SRC_URI = "file://test-libtraining-static.c"

S = "${WORKDIR}"

INSANE_SKIP_${PN} = "ldflags"

do_compile(){
    ${CC} -o test-libtraining-static test-libtraining-static.c ${STAGING_LIBDIR}/libtraining.a 
}

do_install(){
    install -d ${D}${bindir}
    install -m 0755 test-libtraining-static ${D}${bindir}
}