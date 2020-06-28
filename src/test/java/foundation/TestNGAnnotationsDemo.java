package foundation;

import org.testng.annotations.*;

public class TestNGAnnotationsDemo {

    @BeforeTest
    public void beforeTestDemo(){
        System.out.println("Hi this is @BeforeTest");
    }
    @BeforeClass
    public void beforeClassDemo(){
        System.out.println("Hi this is @BeforeClass");
    }
    @BeforeMethod
    public void beforeMethodDemo(){
        System.out.println("Hi this is @BeforeMethod");
    }
    @Test
    public void testA(){
        System.out.println("Hi this is @TestA");
    }
    @Test
    public void testB(){
        System.out.println("Hi this is @TestB");
    }
    @Test
    public void testC(){
        System.out.println("Hi this is @TestC");
    }

    @AfterMethod
    public void afterMethodDemo(){
        System.out.println("Hi this is @AfterMethod");
    }
    @AfterClass
    public void afterClassDemo(){
        System.out.println("Hi this is @AfterClass");
    }
    public void afterTestDemo(){
        System.out.println("Hi this is @AfterTest");
    }

}
