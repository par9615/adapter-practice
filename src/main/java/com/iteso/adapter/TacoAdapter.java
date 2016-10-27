package com.iteso.adapter;

/**
 * Created by simio on 27/10/2016.
 */
public class TacoAdapter implements Taco {

    Torta torta;

    TacoAdapter(Torta torta){
        this.torta = torta;
    }

    public void fill() {
        torta.fill();
    }

    public void fold() {
        torta.cutByHalf();
        torta.cover();
    }

    public void printDescription() {
        torta.printDescription();
    }
}
