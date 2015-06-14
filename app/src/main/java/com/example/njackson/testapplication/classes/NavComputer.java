package com.example.njackson.testapplication.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by njackson on 14/06/15.
 * "Travelin' through hyperspace ain't like dustin' crops, boy! Without precise
 * calculations we could fly right through a star or bounce too close to a supernova,
 * and that'd end your trip real quick, wouldn't it?"
 */
public class NavComputer {

    List<HyperspaceJump> mJumps = new ArrayList<HyperspaceJump>();

    public void addHyperSpaceJump(HyperspaceJump jump) {
        mJumps.add(jump);
    }
    public List<HyperspaceJump> getHyperspaceJumps() {
        return mJumps;
    }

    public void clearHyperspaceJumps() {
        mJumps.clear();
    }
}
