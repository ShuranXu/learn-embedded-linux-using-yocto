DESCRIPTION = "Simple static library"
SECTION = "libs"
LICENSE = "CLOSED"

SRC_URI = "file://add.c \
            file://multiply.c"

S = "${WORKDIR}"

ALLOW_EMPTY_${PN} = "1"
INSANE_SKIP_${PN} = "ldflags"

do_compile(){

    ${CC} -c add.c multiply.c
    ${AR} -cvq libtraining.a add.o multiply.o
}

do_install(){

    install -d ${D}${libdir}
    install -m 0644 libtraining.a ${D}${libdir}
}