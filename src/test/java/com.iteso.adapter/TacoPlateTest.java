package com.iteso.adapter;

import com.iteso.adapter.impl.TacoLengua;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by simio on 29/10/2016.
 */
public class TacoPlateTest {
    TacoPlate tacoPlate;
    Taco taco1;
    Taco taco2;

    @Before
    public void setUp(){
        tacoPlate = new TacoPlate();
        taco1 = mock(Taco.class);
        taco2 = mock(Taco.class);
        tacoPlate.addTaco(taco1);
        tacoPlate.addTaco(taco2);
    }


    @Test
    public void servePlateTest(){
        tacoPlate.servePlate();
        verify(taco1, times(1)).fill();
        verify(taco1, times(1)).fold();
        verify(taco1, times(1)).printDescription();

        verify(taco2, times(1)).fill();
        verify(taco2, times(1)).fold();
        verify(taco2, times(1)).printDescription();

    }
}
