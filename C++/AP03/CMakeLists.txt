cmake_minimum_required(VERSION 3.12)
project(AP03)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES main.cpp)
add_executable(AP03 ${SOURCE_FILES})