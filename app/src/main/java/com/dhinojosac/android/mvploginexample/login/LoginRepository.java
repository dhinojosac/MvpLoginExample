package com.dhinojosac.android.mvploginexample.login;

/**
 * Created by negro-PC on 26-Dec-16.
 */
public interface LoginRepository {

    User getUSer();
    void saveUser(User user);
}
