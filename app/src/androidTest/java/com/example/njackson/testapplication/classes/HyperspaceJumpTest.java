package com.example.njackson.testapplication.classes;

import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.SmallTest;

/**
 * Created by njackson on 14/06/15.
 */
public class HyperspaceJumpTest extends AndroidTestCase {

    private NavComputer mNavComputer;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        // we can create instances of objects that we want to exist before our tests run
        // this method will be called before every test method
        // note always call super.setUp() before your code
        mNavComputer = new NavComputer();
    }

    @Override
    protected void tearDown() throws Exception {
        // this method will be called after each test
        // if you need to do any cleanup do it here
        // always put your code before super.tearDown()

        super.tearDown();
    }

    @SmallTest
    public void testAddingAHyperSpaceJumpIncreasesCollection() {
        mNavComputer.addHyperSpaceJump(new HyperspaceJump(1000, 2000, 3000));

        assertEquals(mNavComputer.getHyperspaceJumps().size(), 1);
    }

    @SmallTest
    public void testClearHyperSpaceJumpsClearsCollection() {
        mNavComputer.addHyperSpaceJump(new HyperspaceJump(1000, 2000, 3000));

        assertEquals(mNavComputer.getHyperspaceJumps().size(), 1);

        mNavComputer.clearHyperspaceJumps();
        assertEquals(mNavComputer.getHyperspaceJumps().size(),0);
    }
}
