package dsb;

import dsb.AbstractTest;
import org.junit.*;
import static org.junit.Assert.*;

public  class GreetingControllerTest extends AbstractTest {

   @Before
   public void setUp(){
    //clean cache before test method
   }

   @After
   public void tearDown(){
      //clean cache after test method
   }

   @Test
   public void testGreetingController1(){
      Assert.assertTrue(Boolean.TRUE);
   }

   @Test
   public void testGreetingController2(){
      Assert.assertTrue(Boolean.TRUE);
   }
}
