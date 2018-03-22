package com.kkk.umg.mvpsimple.model;

/**
 * Created by Dell on 3/21/2018.
 */
public interface IUser {
    String getName();

    String getPasswd();

    int checkUserValidity(String name, String passwd);
}