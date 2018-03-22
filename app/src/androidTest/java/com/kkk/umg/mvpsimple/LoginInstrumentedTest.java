package com.kkk.umg.mvpsimple;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class LoginInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void clickClearButton_LoginButton() throws Exception {
        String name = "mvp";
        String password = "mvp";

        onView(withId(R.id.et_login_username)).perform(typeText("username is mvp"), closeSoftKeyboard());
        onView(withId(R.id.et_login_password)).perform(typeText("password is mvp"),
                closeSoftKeyboard());

        onView(withId(R.id.btn_login_clear)).perform(click());

        onView(withId(R.id.et_login_username)).perform(typeText(name), closeSoftKeyboard());
        onView(withId(R.id.et_login_password)).perform(typeText(password),
                closeSoftKeyboard());


        onView(withId(R.id.btn_login_login)).perform(click());


    }

}
