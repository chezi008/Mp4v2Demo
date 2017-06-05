package com.seuic.jni;

import android.util.Log;

/**
 * 描述：
 * 作者：chezi008 on 2017/4/12 16:14
 * 邮箱：chezi008@163.com
 */

public class Mp4v2Helper {

    public static native int initMp4Encoder(String outputFilePath,int width,int height);

    public static native int mp4VEncode(byte[] data, int size);

    public static native int mp4AEncode(byte[] data, int size);

    public static native void closeMp4Encoder();

    static {
        Log.i("NativeClass", "before load library");
        System.loadLibrary("Mp4v2Helper");//注意这里为自己指定的.so文件，无lib前缀，亦无后缀
        Log.i("NativeClass", "after load library");
    }
}
