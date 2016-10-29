package com.iteso.adapter;

import com.iteso.adapter.impl.TacoLengua;
import com.iteso.adapter.impl.TortaBistec;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by simio on 29/10/2016.
 */
public class TortaBistecTest {
    TortaBistec tortaBistec;

    public static String CUT = "Take a bread and cut it by half";
    public static String FILL = "Take the bottom half and fill it with Bistec";
    public static String COVER = "Put the top of the bread";
    public static String DESCRIPTION = "Bistec Torta";


    @Before
    public void setUp(){
        tortaBistec = new TortaBistec();
    }

    @Test
    public void cutByHalfTest(){
        assertEquals(CUT, tortaBistec.cutByHalf());
    }

    @Test
    public void fillTest(){
        assertEquals(FILL, tortaBistec.fill());
    }

    @Test
    public void coverTest(){
        assertEquals(COVER, tortaBistec.cover());
    }

    @Test
    public void printDescriptionTest(){
        assertEquals(DESCRIPTION, tortaBistec.printDescription());
    }
}
