package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("hBnnN2JApe9pkaQy07HdChPVYGHwDg6GqGGOp2pr")
                .clientKey("wUSDT4La3Vp9uC8Su6RAuFDIY4p6vUbNZubKWIAs")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
