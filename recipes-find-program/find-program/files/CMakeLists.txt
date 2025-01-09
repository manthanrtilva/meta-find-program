cmake_minimum_required(VERSION 3.15)
project(findp)


set(CACHEVAR "SCRIPT_A")
set(PYVENV_DIRECTORY "${CMAKE_SOURCE_DIR}")


find_program(
    "${CACHEVAR}"
    DOC "The Python interpreter to use for ${ARG_KEY}"
    NAMES a.py
    PATHS "${CMAKE_SOURCE_DIR}"
    NO_DEFAULT_PATH
)

if(NOT ${CACHEVAR})
message(FATAL_ERROR "Unable to find script in ${CMAKE_SOURCE_DIR}")
else()
set(SCRIPT_A "$CACHE{${CACHEVAR}}")
message(STATUS "${LOG_PREFIX}: Found script: ${SCRIPT_A}")
endif()
