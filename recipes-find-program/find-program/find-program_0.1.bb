SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "file://CMakeLists.txt \
           file://a.py "

S = "${WORKDIR}"

inherit cmake pkgconfig

EXTRA_OECMAKE = ""

# do_configure:append() {
#     bbplain "Hello,Manthan"
# }