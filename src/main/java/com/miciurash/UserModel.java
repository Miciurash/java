package com.miciurash;

/**
 * Created by mtrofimc on 6/17/2016.
 */
public class UserModel {

    private String username;
    private String password;

    public UserModel(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String setUsername(String username){

        if(username.equals("ion")){
            return this.username;
        }
        return this.username = username;
    }
}
