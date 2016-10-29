package com.iteso.adapter;

/**
 * Created by simio on 27/10/2016.
 */
public class TacoAdapter implements Torta {
    Taco taco;

    public TacoAdapter(Taco taco) {
        this.taco = taco;
    }

    public String cutByHalf() {
        return "";
    }

    public String fill() {
        return taco.fill();
    }

    public String cover() {
        return taco.fold();
    }

    public String printDescription() {
        return taco.printDescription();
    }
}
