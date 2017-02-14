package w17feb14;

/**
 *
 * @author JWright
 */
public class WackyWeather {
    
    /**
     * Simple method to add 2 numbers
     */
    public int sum(int num1, int num2)
    {
        return num1 + num2;
    }
    
    public String weatherInfo(int temp)
    {
        if (temp >= 0)
            return "Wow that's warm for winter";
        else if (temp > -10)
            return "That's beautiful for winter";
        else if (temp > -20)
            return "Joel's super happy";
        else
            return "that's just cold";
    }
}
