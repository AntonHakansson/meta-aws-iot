DESCRIPTION = "AWS iot python module"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS = "python aws-credentials"

SRCNAME = "aws-iot-device-sdk-python"

SRC_URI = "https://github.com/aws/${SRCNAME}/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "66008afdd86b55a22a24aa2954787fba"
SRC_URI[sha256sum] = "d6f067ff61f92676a7688eb1ded5b91da557614f097fcc91fb6066d04760d4ca"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools3
