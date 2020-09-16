SUMMARY = "A small image capable of allowing a device to boot"

IMAGE_INSTALL = "packagegroup-core-boot \
                ${CORE_IMAGE_EXTRA_INSTALL} \
                helloworld \
                hello \
                helloworld-cmake \
                helloworld-make"

IMAGE_LINGUAS = ''

LICENSE = "MIT"

inherit core-image




