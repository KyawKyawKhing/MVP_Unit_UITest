package com.kkk.umg.mvpsimple;

import com.kkk.umg.mvpsimple.presenter.LoginPresenterCompl;
import com.kkk.umg.mvpsimple.view.ILoginView;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class LoginUnitTest {

    @Mock
    private ILoginView loginView;

    private LoginPresenterCompl loginPresenter;

//    @Test
//    public void addition_isCorrect() throws Exception {
//        assertEquals(4, 2 + 2);
//    }

    @Before
    public void setupAddNotePresenter() {
        MockitoAnnotations.initMocks(this);

        loginPresenter = new LoginPresenterCompl(loginView);
    }


    @Test
    public void clickLoginButton() {
        // When the presenter is asked to save a note
        loginPresenter.doLogin("mvp", "mvp");

        verify(loginView).onLoginResult(true, 0);
    }

    @Test
    public void clickClearButton(){
        loginPresenter.clear();
        verify(loginView).onClearText();
    }

}