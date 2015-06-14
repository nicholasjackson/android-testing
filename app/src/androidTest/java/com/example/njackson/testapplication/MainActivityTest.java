package com.example.njackson.testapplication;

import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.test.UiThreadTest;
import android.widget.Switch;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertTrue;

/**
 * Created by njackson on 14/06/15.
 * This is a simple test which allows us to check that one action on the UI correctly triggers another
 * action.  Remember even R2 makes mistakes and the last thing you need when trying to escape the Death Star
 * is a hyperdrive failure.
 */
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testWhenHyperDriveSwitchEnabledStatusLogUpdated() {
        onHyperDriveSwitch.perform(ViewActions.click());
        onHyperDriveSwitch.check(ViewAssertions.matches(isChecked()));
    }

    private ViewInteraction onHyperDriveSwitch = onView(withId(R.id.hyperdriveSwitch));


}
