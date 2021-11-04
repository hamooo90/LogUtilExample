package com.gmail.hamedvakhide.easylog;

import android.util.Log;

public class EasyLog {
    public static final String TAG = "MY_TAG";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
