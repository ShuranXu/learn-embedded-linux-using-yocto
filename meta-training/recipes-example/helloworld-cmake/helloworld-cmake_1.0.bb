DESCRIPTION = "Simple helloworld application built by Cmake"
LICENSE = "CLOSED"

SRC_URI = "file://CMakeLists.txt \
           file://helloworld.c"

S = "${WORKDIR}"

inherit cmake

EXTRA_OECMAKE = " "
