package com.kkk.umg.mvpsimple.view;

/**
 * Created by Dell on 3/21/2018.
 */

public interface ILoginView {
    public void onClearText();
    public void onLoginResult(Boolean result, int code);
    public void onSetProgressBarVisibility(int visibility);
}