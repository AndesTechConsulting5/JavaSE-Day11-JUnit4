package org.andestech.learning.rfb19.g4;

import static org.junit.Assert.assertTrue;

import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;


class AccountException extends Exception
{
    public AccountException(String m)
    {super(m);

    }

    public AccountException()
    {super();

    }

}

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppTest 
{
    @BeforeClass
    public static void init(){
        //....................
        System.out.println("Class init....");
    }


    public AppTest(){
        System.out.println("+++ ctor: " + this);
    }

    @Test
    //@Ignore
    @Category(IFastTest.class)
    public void try1Test()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

       // assertTrue( true );
    }

    @Test
    public void try2Test()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

        // assertTrue( true );
    }

    @Test(expected = AccountException.class)
    public void negativeAccountTest() throws AccountException
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        throw  new AccountException("account error..");

        // assertTrue( true );
    }


    @Test
    public void aTest(){

    }

    @AfterClass
    public static void tearDown(){
        //....................
        System.out.println("Class clear all data....");
    }

}
