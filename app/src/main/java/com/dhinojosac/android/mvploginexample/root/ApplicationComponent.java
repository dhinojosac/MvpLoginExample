package com.dhinojosac.android.mvploginexample.root;

import com.dhinojosac.android.mvploginexample.LoginActivity;
import com.dhinojosac.android.mvploginexample.login.LoginModel;
import com.dhinojosac.android.mvploginexample.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by negro-PC on 26-Dec-16.
 */
@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {
    void inject(LoginActivity target);
}
