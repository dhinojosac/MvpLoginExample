package com.dhinojosac.android.mvploginexample.login;

import android.support.annotation.Nullable;

import com.dhinojosac.android.mvploginexample.LoginActivity;

/**
 * Created by negro-PC on 26-Dec-16.
 */
public class LoginActivityPresenter implements LoginActivityMVP.Presenter {
    @Nullable
    private LoginActivityMVP.View view;
    private LoginActivityMVP.Model model;

    public LoginActivityPresenter(LoginActivityMVP.Model model){
        this.model = model;
    }

    @Override
    public void setView(LoginActivityMVP.View view) {
        this.view = view;
    }

    @Override
    public void loginButtonClicked() {
        if(view != null){
            if (view.getFirstName().trim().equals("") || view.getLastName().trim().equals("")){
                view.showInputError();
            }else{
                model.createUser(view.getFirstName(),view.getLastName());
                view.showUserSavedMessage();

            }
        }
    }

    @Override
    public void getCurrrentUser() {
        User user = model.getUser();
        if(user == null){
            if(view!= null){
                view.showUSerNotAvailable();
            }
        }else {
            if(view!=null){
                view.setFirstName(user.getFirstName());
                view.setLastName(user.getLastName());
            }

        }
    }
}
