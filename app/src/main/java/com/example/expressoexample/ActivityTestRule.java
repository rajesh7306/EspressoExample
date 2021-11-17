package com.example.expressoexample;

import android.app.Activity;

public class ActivityTestRule<M extends Activity> {
    public ActivityTestRule(Class<MainActivity> mainActivityClass) {
    }
}
