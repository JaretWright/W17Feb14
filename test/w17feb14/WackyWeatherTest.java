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
    public void testWeatherInfoWarm() {
        System.out.println("testWeatherInfoWarm");
        WackyWeather instance = new WackyWeather();
        String expResult = "Wow that's warm for winter";
        String result = instance.weatherInfo(1);
        assertEquals(expResult, result);
    }
 
    /**
     * Test of sum method, of class WackyWeather.
     */
    @Test
    public void testWeatherInfoWarm2() {
        System.out.println("testWeatherInfoWarm");
        WackyWeather instance = new WackyWeather();
        String expResult = "Wow that's warm for winter";
        String result = instance.weatherInfo(0);
        assertEquals(expResult, result);
    }
    
       /**
     * Test of sum method, of class WackyWeather.
     */
    @Test
    public void testWeatherInfoNormal1() {
        System.out.println("testWeatherInfoWarm");
        WackyWeather instance = new WackyWeather();
        String expResult = "That's beautiful for winter";
        String result = instance.weatherInfo(-1);
        assertEquals(expResult, result);
    }
    
          /**
     * Test of sum method, of class WackyWeather.
     */
    @Test
    public void testWeatherInfoNormal2() {
        System.out.println("testWeatherInfoWarm");
        WackyWeather instance = new WackyWeather();
        String expResult = "That's beautiful for winter";
        String result = instance.weatherInfo(-9);
        assertEquals(expResult, result);
    }
    
              /**
     * Test of sum method, of class WackyWeather.
     */
    @Test
    public void testWeatherInfoNormalCold() {
        System.out.println("testWeatherInfoWarm");
        WackyWeather instance = new WackyWeather();
        String expResult = "Joel's super happy";
        String result = instance.weatherInfo(-10);
        assertEquals(expResult, result);
    }
    
                  /**
     * Test of sum method, of class WackyWeather.
     */
    @Test
    public void testWeatherInfoNormalCold2() {
        System.out.println("testWeatherInfoWarm");
        WackyWeather instance = new WackyWeather();
        String expResult = "Joel's super happy";
        String result = instance.weatherInfo(-11);
        assertEquals(expResult, result);
    }
 
    /* Test of sum method, of class WackyWeather.
     */
    @Test
    public void testWeatherInfoNormalCold3() {
        System.out.println("testWeatherInfoCold");
        w17feb14.WackyWeather instance = new w17feb14.WackyWeather();
        String expResult = "Joel's super happy";
        String result = instance.weatherInfo(-19);
        assertEquals(expResult, result);
    }
    
        /* Test of sum method, of class WackyWeather.
     */
    @Test
    public void testWeatherInfoNormalCold4() {
        System.out.println("testWeatherInfoCold");
        w17feb14.WackyWeather instance = new w17feb14.WackyWeather();
        String expResult = "that's just cold";
        String result = instance.weatherInfo(-20);
        assertEquals(expResult, result);
    }
}
    
   
