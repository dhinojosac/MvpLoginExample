package com.dhinojosac.android.mvploginexample.login;

import com.dhinojosac.android.mvploginexample.LoginActivity;

/**
 * Created by negro-PC on 26-Dec-16.
 */
public interface LoginActivityMVP {

    interface View{
        String getFirstName();
        String getLastName();

        void showUSerNotAvailable();
        void showInputError();
        void showUserSavedMessage();

        void setFirstName(String fname);
        void setLastName(String lname);


    }

    interface Presenter{

        void setView(LoginActivityMVP.View view);

        void loginButtonClicked();

        void  getCurrrentUser();

    }

    interface  Model{
        void createUser(String fname, String lname);
        User getUser();
    }
}
