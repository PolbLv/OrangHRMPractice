package com.openhrm.data;

/**
 * Created by LVIVSOFT\spolyakov on 28.06.17.
 */
public class User {

    private final String username;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    private final String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


}

