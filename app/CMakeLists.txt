
#CMake版本信息
cmake_minimum_required(VERSION 3.4.1)

#set(distribution_DIR ${CMAKE_SOURCE_DIR}/../../../../libs)
#支持-std=gnu++11
#set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=gnu++11")
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS}  -std=c++14 -pthread -DMGULK_LOG_STDERR=1 -Wall -Wextra -Wnon-virtual-dtor -g")

##set *.h source path
include_directories(${CMAKE_SOURCE_DIR}/src/main/cpp/include)

#set *.so files output path，please add this before add_library
#set(CMAKE_LIBRARY_OUTPUT_DIRECTORY ${PROJECT_SOURCE_DIR}/src/main/jniLibs/${ANDROID_ABI})
set(jnilibs "${CMAKE_SOURCE_DIR}/src/main/jniLibs")
set(CMAKE_LIBRARY_OUTPUT_DIRECTORY ${jnilibs}/${ANDROID_ABI})


ADD_SUBDIRECTORY(${CMAKE_SOURCE_DIR}/src/main/cpp/mp4record)
ADD_SUBDIRECTORY(${CMAKE_SOURCE_DIR}/src/main/cpp/mp4v2helper)


