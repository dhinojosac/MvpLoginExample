package com.dhinojosac.android.mvploginexample.root;

import android.app.Application;

import com.dhinojosac.android.mvploginexample.login.LoginModule;

/**
 * Created by negro-PC on 26-Dec-16.
 */
public class App extends Application {
    private ApplicationComponent component;

    @Override
    public  void onCreate(){
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
