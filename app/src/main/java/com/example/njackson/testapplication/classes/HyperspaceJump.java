package com.example.njackson.testapplication.classes;

import android.support.annotation.VisibleForTesting;

/**
 * Created by njackson on 14/06/15.
 */
public class HyperspaceJump {

    private int x;
    private int y;
    private int z;
    private int distance;

    public HyperspaceJump(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.distance = calculateDistance();
    }

    @VisibleForTesting
    protected int calculateDistance(){

        return x + y + z;
    }
}
