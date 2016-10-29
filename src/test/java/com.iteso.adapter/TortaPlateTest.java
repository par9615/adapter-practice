package com.iteso.adapter;

import com.iteso.adapter.impl.TacoLengua;
import com.iteso.adapter.impl.TortaBistec;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

/**
 * Created by simio on 29/10/2016.
 */
public class TortaPlateTest {
    TortaPlate tortaPlate;


    @Before
    public void setUp(){
        tortaPlate = mock(TortaPlate.class);
        Torta torta1 = new TortaBistec();
        Torta torta2 = new TortaBistec();
        tortaPlate.addTorta(torta1);
        tortaPlate.addTorta(torta2);
    }

    @Test
    public void addTacoTest(){

        Mockito.verify(tortaPlate, times(2)).addTorta((Torta) any());
    }

    @Test
    public void servePlateTest(){
        tortaPlate.servePlate();


    }
}
