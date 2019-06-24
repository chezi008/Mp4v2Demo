add_library(Mp4v2Helper SHARED Mp4v2Helper.c)

add_library(mp4v2sdk SHARED IMPORTED)
set_target_properties(mp4v2sdk PROPERTIES IMPORTED_LOCATION "${jnilibs}/${ANDROID_ABI}/libmp4v2.so")

find_library(log-lib log)

target_link_libraries(Mp4v2Helper mp4v2sdk ${log-lib})