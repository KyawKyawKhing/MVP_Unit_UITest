package com.kkk.umg.mvpsimple.presenter;

/**
 * Created by Dell on 3/21/2018.
 */

public interface ILoginPresenter {
    void clear();
    void doLogin(String name, String passwd);
    void setProgressBarVisiblity(int visiblity);
}