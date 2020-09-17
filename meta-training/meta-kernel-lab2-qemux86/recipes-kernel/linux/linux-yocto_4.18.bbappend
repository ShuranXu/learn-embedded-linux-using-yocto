FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

COMPATIBLE_MACHINE_kernel-lab2-qemux86 = "kernel-lab2-qemux86"

KMACHINE_kernel-lab2-qemux86  = "common-pc"

SRC_URI += "file://yocto-testmodule.patch"
SRC_URI += "file://lab2.cfg"

KERNEL_FEATURES_append_kernel-lab2-qemux86 += " cfg/smp.scc"

LINUX_VERSION_kernel-lab2-qemux86 = "4.18.27"


