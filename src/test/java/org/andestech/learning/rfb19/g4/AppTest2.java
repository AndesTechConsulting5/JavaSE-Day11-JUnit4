package org.andestech.learning.rfb19.g4;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.Timeout;

//import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class AppTest2
{
    @Rule
    public Timeout t = new Timeout(200);


    @Test
    public void try3Test()
    {
       assertFalse( 1==2 );


       assertTrue( 1!=2 );
    }

   // @Test(timeout = 200)
    @Test
    public void timeout1Test() throws InterruptedException{

        Thread.sleep(250);


    }

    @Test
    @Category(IFastTest.class)
    public void try4Test()
    {

        int aExp= 1001;
        int aAct = 1002;

        //Assert.assertEquals(aExp,aAct);
        Assert.assertEquals("Fall data...",aExp,aAct);

        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});


    }

    @Test
    public void try5Test()
    {
        int[] arr  = {1,2,3};
        arr[3] = 12;


        // assertTrue( true );
    }

    @Test
    public void try6Test()
    {
        int[] arr  = {1,2,3};
        arr[2] = 12;

        double dExp = 1.23456;
        double dAct = 1.234567;

        assertEquals(dExp, dAct,1e-4);


        // assertTrue( true );
    }
}
