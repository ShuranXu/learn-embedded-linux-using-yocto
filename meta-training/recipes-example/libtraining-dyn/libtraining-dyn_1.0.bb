DESCRIPTION = "Simple Dynamic library"
SECTION = "libs"
LICENSE = "CLOSED"

SRC_URI = "file://subtract.c \
            file://divide.c"

S = "${WORKDIR}"

do_compile(){
    ${CC} -fPIC -g -c subtract.c divide.c
    ${CC} -shared -Wl,-soname,libtraining.so.1 -o libtraining.so.1.0 subtract.o divide.o ${LDFLAGS}
}

do_install(){
    install -d ${D}${libdir}
    install -m 0755 libtraining.so.1.0 ${D}${libdir}
    ln -s libtraining.so.1.0 ${D}/${libdir}/libtraining.so.1
    ln -s libtraining.so.1 ${D}/${libdir}/libtraining.so 
}
