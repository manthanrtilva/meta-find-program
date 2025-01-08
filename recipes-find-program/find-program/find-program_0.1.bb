SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "file://CMakeLists.txt \
           file://a.py "

S = "${WORKDIR}"

inherit cmake pkgconfig

EXTRA_OECMAKE = "-DFIREBASE_INCLUDE_LIBRARY_DEFAULT=OFF -DFIREBASE_INCLUDE_AUTH=ON -DFIREBASE_INCLUDE_FIRESTORE=ON"

do_configure:append() {
    bbplain "Hello,Manthan"
}