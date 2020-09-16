DESCRIPTION = "Simple Hello World application"

LICENSE = "CLOSED"


SRC_URI = "file://helloworld.c"
SRC_URI[md5sum] = "000c3b3b65ecb993ea0216bd6b48e871"

S = "${WORKDIR}"

do_compile(){
    ${CC} helloworld.c -o helloworld ${LDFLAGS}
}

do_install(){
    install -d ${D}${bindir}
    install -m 0755 helloworld ${D}${bindir}
}