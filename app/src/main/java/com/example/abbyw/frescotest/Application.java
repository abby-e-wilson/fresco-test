package com.example.abbyw.frescotest;

import com.facebook.drawee.backends.pipeline.Fresco;

public class Application extends android.app.Application{
    @Override
    public void onCreate(){
        super.onCreate();
        Fresco.initialize(this);
    }
}
