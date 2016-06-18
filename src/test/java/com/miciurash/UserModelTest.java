package com.miciurash;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mtrofimc on 6/17/2016.
 */
public class UserModelTest {

    @Test
    public void usernameIonTest(){
        UserModel um = new UserModel("A", ":");

        String uset = um.setUsername("ion");
        Assert.assertTrue(uset.equals("A"));
    }

    @Test
    public void usernameNickTest(){
        UserModel um = new UserModel("A", ":");

        String uset = um.setUsername("nic");
        Assert.assertTrue(uset.equals("nic"));
    }

}