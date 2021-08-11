package com.codepath.instagramclone;

import android.app.Application;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.codepath.instagramclone.fragments.ProfileFragment;
import com.parse.LogOutCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        // set applicationId, and server server based on the values in the back4app settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YJJ7pwQdn6IcSjBSdZ7kfWHRVxtCDyQ24XrHd1YS") // should correspond to Application Id env variable
                .clientKey("aY9khpxfMcdcKRW8ZdWmXuyuNBHLaazSRmVLYOlO") // should correspond to Client key env variable
                .server("https://parseapi.back4app.com")
                .build()
        );


    }
}
