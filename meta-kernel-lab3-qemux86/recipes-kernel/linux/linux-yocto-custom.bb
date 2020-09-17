# This file was derived from the linux-yocto-custom.bb recipe in
# oe-core.
#
# linux-yocto-custom.bb:
#
#   A yocto-bsp-generated kernel recipe that uses the linux-yocto and
#   oe-core kernel classes to apply a subset of yocto kernel
#   management to git managed kernel repositories.
#
# Warning:
#
#   Building this kernel without providing a defconfig or BSP
#   configuration will result in build or boot errors. This is not a
#   bug.
#
# Notes:
#
#   patches: patches can be merged into to the source git tree itself,
#            added via the SRC_URI, or controlled via a BSP
#            configuration.
#
#   example configuration addition:
#            SRC_URI += "file://smp.cfg"
#   example patch addition:
#            SRC_URI += "file://0001-linux-version-tweak.patch
#   example feature addition:
#            SRC_URI += "file://feature.scc"
#

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

KBRANCH = "linux-4.2.y"

SRC_URI_kernel-lab3-qemux86 = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;protocol=git;nocheckout=1;branch=${KBRANCH}"

SRC_URI_kernel-lab3-qemux86 += "file://defconfig"

SRC_URI_kernel-lab3-qemux86 += "file://yocto-testmodule.patch"
SRC_URI_kernel-lab3-qemux86 += "file://lab3.cfg"

KERNEL_MODULE_AUTOLOAD += "yocto-testmodule"

LINUX_VERSION_kernel-lab3-qemux86 ?= "4.2"
LINUX_VERSION_EXTENSION_kernel-lab3-qemux86 ?= "-custom"

SRCREV_kernel-lab3-qemux86="64291f7db5bd8150a74ad2036f1037e6a0428df2"
#SRCREV="${AUTOREV}"

PR = "r1"
PV = "${LINUX_VERSION}+git${SRCPV}"

COMPATIBLE_MACHINE_kernel-lab3-qemux86 = "kernel-lab3-qemux86"
