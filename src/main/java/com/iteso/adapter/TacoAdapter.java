package com.iteso.adapter;

/**
 * Created by simio on 27/10/2016.
 */
public class TacoAdapter implements Torta {
    Taco taco;

    public TacoAdapter(Taco taco) {
        this.taco = taco;
    }

    public void cutByHalf() {

    }

    public void fill() {
        taco.fill();
    }

    public void cover() {
        taco.fold();
    }

    public void printDescription() {
        taco.printDescription();
    }
}
