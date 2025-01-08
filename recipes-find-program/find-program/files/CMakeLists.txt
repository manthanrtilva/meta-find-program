cmake_minimum_required(VERSION 3.15)
project(findp)

# CACHEVAR:FIREBASE_PYTHON_EXECUTABLE_LevelDbPatch ARG_KEY:LevelDbPatch CACHE{CACHEVAR}:FIREBASE_PYTHON_EXECUTABLE_LevelDbPatch-NOTFOUND

set(CACHEVAR "FIREBASE_PYTHON_EXECUTABLE_LevelDbPatch")
set(ARG_KEY "LevelDbPatch")
set(PYVENV_DIRECTORY "/tmp/build-app/bin/external/src/firestore-build/external/pyvenv/LevelDbPatch/")
set(PYVENV_DIRECTORY "/home/gitlab-runner/yocto/build/tmp/work/armv8a-poky-linux/firebase-cpp-sdk/12.5.0-r0/build/external/src/firestore-build/external/pyvenv/LevelDbPatch/bin/")
set(PYVENV_DIRECTORY "${CMAKE_SOURCE_DIR}")


find_program(
"${CACHEVAR}"
DOC "The Python interpreter to use for ${ARG_KEY}"
NAMES a.py
PATHS "${CMAKE_SOURCE_DIR}"
#PATH_SUFFIXES bin Scripts
NO_DEFAULT_PATH
)

message(STATUS "CACHEVAR:${CACHEVAR} ARG_KEY:${ARG_KEY} CACHE{CACHEVAR}:$CACHE{${CACHEVAR}} PYVENV_DIRECTORY:${PYVENV_DIRECTORY} CMAKE_SOURCE_DIR:${CMAKE_SOURCE_DIR}")
if(NOT ${CACHEVAR})
message(FATAL_ERROR "Unable to find Python executable in ${PYVENV_DIRECTORY}")
else()
set(PYTHON_EXECUTABLE "$CACHE{${CACHEVAR}}")
message(STATUS "${LOG_PREFIX}: Found Python executable in virtualenv: ${PYTHON_EXECUTABLE}")
endif()
