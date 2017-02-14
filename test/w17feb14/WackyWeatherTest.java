package w17feb14;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JWright
 */
public class WackyWeatherTest {
    
    public WackyWeatherTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sum method, of class WackyWeather.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int num1 = 10;
        int num2 = 10;
        WackyWeather instance = new WackyWeather();
        int expResult = 20;
        int result = instance.sum(num1, num2);
        assertEquals(expResult, result);
    }
    
       /**
     * Test of sum method, of class WackyWeather.
     */
    @Test
    public void testSum2() {
        System.out.println("sum2");
        int num1 = 10;
        int num2 = 20;
        WackyWeather instance = new WackyWeather();
        int expResult = 30;
        int result = instance.sum(num1, num2);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of sum method, of class WackyWeather.
     */
    @Test
    public void testSum2() {
        System.out.println("sum2");
        int num1 = 10;
        int num2 = 20;
        WackyWeather instance = new WackyWeather();
        int expResult = 30;
        int result = instance.sum(num1, num2);
        assertEquals(expResult, result);
    }
    
}
    
   
