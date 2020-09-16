SUMMARY = "GNU helloworld application using Autotools"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
SRC_URI = "${GNU_MIRROR}/hello/hello-${PV}.tar.gz"
SRC_URI[md5sum] = "fc01b05c7f943d3c42124942a2a9bb3a"

inherit autotools gettext
