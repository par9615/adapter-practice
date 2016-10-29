package com.iteso.adapter;

import com.iteso.adapter.impl.TacoLengua;
import com.iteso.adapter.impl.TortaBistec;
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
public class TortaPlateTest {
    TortaPlate tortaPlate;
    Torta torta1;
    Torta torta2;

    @Before
    public void setUp(){
        tortaPlate = new TortaPlate();
        torta1 = mock(Torta.class);
        torta2 = mock(Torta.class);
        tortaPlate.addTorta(torta1);
        tortaPlate.addTorta(torta2);
    }

     @Test
    public void servePlateTest(){
        tortaPlate.servePlate();
        verify(torta1, times(1)).fill();
        verify(torta1, times(1)).fill();
        verify(torta1, times(1)).cover();
        verify(torta1, times(1)).printDescription();

        verify(torta2, times(1)).cutByHalf();
        verify(torta2, times(1)).fill();
        verify(torta2, times(1)).cover();
        verify(torta2, times(1)).printDescription();


    }
}
