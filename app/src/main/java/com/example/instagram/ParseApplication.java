package com.example.instagram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("a6kH6nANH0H1aOXOhMYAiFvmTdwXWlxeYeMEU5aO")
                .clientKey("FJkqXUjgcVuqoAC3e5i6rkxtWwRSs5XjWKKhEVnP")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
