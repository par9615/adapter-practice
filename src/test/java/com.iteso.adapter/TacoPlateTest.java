package com.iteso.adapter;

import com.iteso.adapter.impl.TacoLengua;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.omg.CORBA.Object;

import static com.sun.javaws.JnlpxArgs.verify;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

/**
 * Created by simio on 29/10/2016.
 */
public class TacoPlateTest {
    TacoPlate tacoPlate;


    @Before
    public void setUp(){
        tacoPlate = mock(TacoPlate.class);
        Taco taco1 = new TacoLengua();
        Taco taco2 = new TacoLengua();
        tacoPlate.addTaco(taco1);
        tacoPlate.addTaco(taco2);
    }

    @Test
    public void addTacoTest(){

        Mockito.verify(tacoPlate, times(2)).addTaco((Taco) any());
    }

    @Test
    public void servePlateTest(){
        tacoPlate.servePlate();


    }
}
