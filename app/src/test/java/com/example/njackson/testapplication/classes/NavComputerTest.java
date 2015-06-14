package com.example.njackson.testapplication.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by njackson on 14/06/15.
 */
public class NavComputerTest {

    private NavComputer mNavComputer;

    @Before
    protected void setUp(){

        // we can create instances of objects that we want to exist before our tests run
        // this method will be called before every test method
        // note always call super.setUp() before your code
        mNavComputer = new NavComputer();
    }

    @After
    protected void tearDown(){
        // this method will be called after each test
        // if you need to do any cleanup do it here
        // always put your code before super.tearDown()
    }

    @Test
    public void addingAHyperSpaceJumpIncreasesCollection() {
        mNavComputer.addHyperSpaceJump(new HyperspaceJump(1000, 2000, 3000));

        assertEquals(mNavComputer.getHyperspaceJumps().size(), 1);
    }

    @Test
    public void clearHyperSpaceJumpsClearsCollection() {
        mNavComputer.addHyperSpaceJump(new HyperspaceJump(1000, 2000, 3000));

        mNavComputer.clearHyperspaceJumps();
        assertEquals(mNavComputer.getHyperspaceJumps().size(),0);
    }
}
