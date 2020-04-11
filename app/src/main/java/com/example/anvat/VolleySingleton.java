package com.example.anvat;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingleton {
    private static VolleySingleton INSTANCE;
    private RequestQueue requestQueue;

    private VolleySingleton(Context context){
        if(requestQueue == null){
            requestQueue = Volley.newRequestQueue(context);
        }
    }

    public static VolleySingleton getInstance(Context context){
        if(INSTANCE == null){
            INSTANCE = new VolleySingleton(context);
        }
        return INSTANCE;
    }

    public RequestQueue getRequestQueue() {
        return requestQueue;
    }

}
