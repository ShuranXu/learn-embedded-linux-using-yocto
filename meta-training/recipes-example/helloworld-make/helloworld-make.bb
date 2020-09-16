SUMMARY = "Helloworld application using GNU Makefile"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "file://helloworld-make.c \
            file://Makefile"
        
S = "${WORKDIR}"
EXTRA_OEMAKE = " 'CC=${CC}' 'LINK=${CC}'"

do_compile(){
    oe_runmake -f Makefile
}

do_install(){
    install -d ${D}${bindir}
    install -c -m 0755 ${S}/helloworld-make ${D}${bindir}
}

INSANE_SKIP_${PN} = "ldflags"
INSANE_SKIP_${PN}-dev = "ldflags"