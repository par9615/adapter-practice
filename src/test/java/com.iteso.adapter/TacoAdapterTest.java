package com.iteso.adapter;

import com.iteso.adapter.impl.TacoLengua;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by simio on 29/10/2016.
 */
public class TacoAdapterTest {
    TacoAdapter tacoAdapter;
    Taco taco;
    public static String CUT  = "";
    public static String FILL = "Take a tortilla and fill it with Lengua";
    public static String FOLD = "Fold the tortilla";
    public static String DESCRIPTION = "Lengua Taco";


    @Before
    public void setUp(){
        taco = new TacoLengua();
        tacoAdapter = new TacoAdapter(taco);
    }

    @Test
    public void cutByHalfTest(){
        assertEquals(CUT, tacoAdapter.cutByHalf());
    }

    @Test
    public void fillTest(){
        assertEquals(FILL, tacoAdapter.fill());
    }

    @Test
    public void coverTest(){
        assertEquals(FOLD, tacoAdapter.cover());
    }

    @Test
    public void printDescriptionTest(){
        assertEquals(DESCRIPTION, tacoAdapter.printDescription());
    }
}
