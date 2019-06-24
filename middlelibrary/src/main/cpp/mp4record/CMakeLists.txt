add_library(mp4record SHARED mp4record.c)

add_library(mp4v2sdk SHARED IMPORTED)
set_target_properties(mp4v2sdk PROPERTIES IMPORTED_LOCATION "${jnilibs}/${ANDROID_ABI}/libmp4v2.so")

find_library(log-lib log)

target_link_libraries(mp4record mp4v2sdk ${log-lib})



