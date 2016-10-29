package com.iteso.adapter;

import com.iteso.adapter.impl.TacoLengua;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by simio on 29/10/2016.
 */
public class TacoLenguaTest {
    TacoLengua tacoLengua;

    public static String FILL = "Take a tortilla and fill it with Lengua";
    public static String FOLD = "Fold the tortilla";
    public static String DESCRIPTION = "Lengua Taco";


    @Before
    public void setUp(){
        tacoLengua = new TacoLengua();
    }

    @Test
    public void fillTest(){
        assertEquals(FILL, tacoLengua.fill());
    }

    @Test
    public void foldTest(){
        assertEquals(FOLD, tacoLengua.fold());
    }

    @Test
    public void printDescriptionTest(){
        assertEquals(DESCRIPTION, tacoLengua.printDescription());
    }
}
