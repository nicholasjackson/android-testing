package com.example.njackson.testapplication.classes;

import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.SmallTest;

/**
 * Created by njackson on 14/06/15.
 */
public class CalculatorTest extends AndroidTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @SmallTest
    public void test2Plus2Equals4() {
        Calculator calculator = new Calculator();

        int value = calculator.Add(2,2);

        assertEquals(value, 4);
    }
}
