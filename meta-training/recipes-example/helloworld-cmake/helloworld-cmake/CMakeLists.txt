cmake_minimum_required(VERSION 2.8)
project(helloworld-cmake)
add_executable(helloworld-cmake helloworld.c)
install(TARGETS helloworld-cmake RUNTIME DESTINATION bin)
