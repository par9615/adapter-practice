package com.iteso.adapter;

import com.iteso.adapter.impl.TacoLengua;
import com.iteso.adapter.impl.TortaBistec;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by simio on 29/10/2016.
 */
public class TortaAdapterTest {
    TortaAdapter tortaAdapter;
    Torta torta;

    public static String CUT = "Take a bread and cut it by half";
    public static String FILL = "Take the bottom half and fill it with Bistec";
    public static String COVER = "Put the top of the bread";
    public static String DESCRIPTION = "Bistec Torta";

    @Before
    public void setUp(){
        torta = new TortaBistec();
        tortaAdapter = new TortaAdapter(torta);
    }

    @Test
    public void fillTest(){
        assertEquals(CUT + "&" + FILL, tortaAdapter.fill());
    }

    @Test
    public void foldTest(){
        assertEquals(COVER, tortaAdapter.fold());
    }

    @Test
    public void printDescriptionTest(){
        assertEquals(DESCRIPTION, tortaAdapter.printDescription());
    }
}
