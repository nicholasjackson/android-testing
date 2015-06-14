package com.example.njackson.testapplication.classes;

import java.util.List;

/**
 * Created by njackson on 14/06/15.
 */
public interface INavComputer  {

    void addHyperSpaceJump(HyperspaceJump jump);
    List<HyperspaceJump> getHyperspaceJumps();
    void clearHyperspaceJumps();

}
