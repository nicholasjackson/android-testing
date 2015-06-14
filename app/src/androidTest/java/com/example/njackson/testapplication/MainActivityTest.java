package com.example.njackson.testapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.test.suitebuilder.annotation.SmallTest;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

/**
 * Created by njackson on 14/06/15.
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

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mActivity = getActivity();
        mHyperdriveSwitch = (Switch)mActivity.findViewById(R.id.hyperdriveSwitch);
        mStatusLog = (TextView) mActivity.findViewById(R.id.statusLog);

        assertNotNull(mHyperdriveSwitch);
        assertNotNull(mStatusLog);
    }

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
