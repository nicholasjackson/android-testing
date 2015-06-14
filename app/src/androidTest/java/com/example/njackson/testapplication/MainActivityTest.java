package com.example.njackson.testapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Switch;
import android.widget.TextView;

/**
 * Created by njackson on 14/06/15.
 * This is a simple test which allows us to check that one action on the UI correctly triggers another
 * action.  Remember even R2 makes mistakes and the last thing you need when trying to escape the Death Star
 * is a hyperdrive failure.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mActivity;
    private Switch mHyperdriveSwitch;
    private TextView mStatusLog;

    public MainActivityTest() {
       super(MainActivity.class);
    }

    public MainActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    /*
     * setUp will run before every instance of your test methods
     * it is a good place to verify that the view has been correctly initialised
     * you can test that you have the various components that your activity will rely on.
     * This is especially useful when you have a pesky astromech droid messing with your controls.
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mActivity = getActivity();
        mHyperdriveSwitch = (Switch)mActivity.findViewById(R.id.hyperdriveSwitch);
        mStatusLog = (TextView) mActivity.findViewById(R.id.statusLog);

        assertNotNull(mHyperdriveSwitch);
        assertNotNull(mStatusLog);
    }

    /*
     * @UiThreadTest lets us run all the contents of this test method on the UI thread
     * when trying to interact with buttons from a thread which is not the main UI thread
     * Android will throw an exception
     */
    @UiThreadTest
    public void testWhenHyperDriveSwitchEnabledStatusLogUpdated() {
        mHyperdriveSwitch.setChecked(false);
        mHyperdriveSwitch.callOnClick();

        CharSequence statusText = mStatusLog.getText();

        assertTrue(statusText.toString().contains("Hyperdrive enabled"));
    }

    @UiThreadTest
    public void testWhenHyperDriveSwitchDisabledStatusLogUpdated() {
        mHyperdriveSwitch.setChecked(true);
        mHyperdriveSwitch.callOnClick();

        CharSequence statusText = mStatusLog.getText();

        assertTrue(statusText.toString().contains("Hyperdrive disabled"));
    }

}
