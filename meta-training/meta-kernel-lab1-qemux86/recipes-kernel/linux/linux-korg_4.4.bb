DESCRIPTION = "Mainline Linux Kernel"
SECTION = "kernel"
LICENSE = "GPLv2"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel


SRC_URI = "${KERNELORG_MIRROR}/linux/kernel/v4.x/linux-${PV}.tar.gz;name=kernel \
	   file://0001-calibrate-Add-printk-example.patch \
	   file://yocto-testmodule.patch \
           file://defconfig"


S = "${WORKDIR}/linux-${PV}"

SRC_URI[kernel.md5sum] = "2070b49688e8d7ee7ff4c33590afc698"
SRC_URI[kernel.sha256sum] = "730e75919b5d30a9bc934ccb300eaedfdf44994ca9ee1d07a46901c46c221357"
COMPATIBLE_MACHINE = "kernel-lab1-qemux86"
