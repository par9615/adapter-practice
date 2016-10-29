package com.iteso.adapter.impl;

import com.iteso.adapter.Torta;

/**
 * Created by rvillalobos on 11/16/14.
 */
public class TortaBistec implements Torta {
    @Override
    public String cutByHalf() {
        return "Take a bread and cut it by half";
    }

    @Override
    public String fill() {
        return "Take the bottom half and fill it with Bistec";
    }

    @Override
    public String cover() {
        return "Put the top of the bread";
    }

    @Override
    public String printDescription() {
        return "Bistec Torta";
    }
}
