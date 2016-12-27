package com.dhinojosac.android.mvploginexample.login;

/**
 * Created by negro-PC on 26-Dec-16.
 */
public class MemoryRepository implements LoginRepository  {
    private User user;

    @Override
    public User getUSer() {
        if (user == null){
            User user = new User("Diego", "Hinojosa");
            user.setId(0);
            return user;
        }else {
            return user;
        }
    }

    @Override
    public void saveUser(User user) {
        if (user == null){
            user = getUSer();
        }
        this.user = user;
    }
}
