package com.openhrm.data;

/**
 * Created by LVIVSOFT\spolyakov on 28.06.17.
 */
public class User {

    private final String username;

    private final String name;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName(){
        return name;
    }

    private final String password;

    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

