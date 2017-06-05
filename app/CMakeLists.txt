
#CMake版本信息
cmake_minimum_required(VERSION 3.4.1)

set(distribution_DIR ${CMAKE_SOURCE_DIR}/../../../../libs)
#支持-std=gnu++11
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=gnu++11")


add_library( mp4v2
             SHARED
             IMPORTED )
set_target_properties( mp4v2
                       PROPERTIES IMPORTED_LOCATION
                       ../../../../libs/armeabi/libmp4v2.so )
include_directories(libs/include)



add_library(Mp4v2Helper SHARED
        src/main/cpp/Mp4v2Helper.c
)


find_library( # Sets the name of the path variable.
              log-lib

              # Specifies the name of the NDK library that
              # you want CMake to locate.
              log )

target_link_libraries( Mp4v2Helper mp4v2 ${log-lib} )

