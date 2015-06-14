package com.example.njackson.testapplication.classes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HyperspaceJumpTest {

    private HyperspaceJump hyperspaceJump;

    @Test
    public void calculateDistanceSumsUpCorrectly(){

        hyperspaceJump = new HyperspaceJump(1, 1, 1);
        assertEquals(3, hyperspaceJump.calculateDistance());
    }
}
