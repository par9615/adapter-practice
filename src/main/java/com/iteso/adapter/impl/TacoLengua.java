package com.iteso.adapter.impl;

import com.iteso.adapter.Taco;

/**
 * Created by rvillalobos on 11/16/14.
 */
public class TacoLengua implements Taco {


    @Override
    public String fill() {
        return "Take a tortilla and fill it with Lengua";
    }

    @Override
    public String fold() {
        return "Fold the tortilla";

    }

    @Override
    public String printDescription() {
        return "Lengua Taco";
    }
}
