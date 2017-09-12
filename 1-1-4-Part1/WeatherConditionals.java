public class WeatherConditionals
{
    public static void getWeatherAdvice(int t, String d){
        boolean windy = false;
        boolean snow = false;
        if (d.contains("windy"))
            windy = true;
        if (d.contains("snow"))
            snow = true;
        if(t > 30 || windy){
            System.out.println("Too windy or cold! Enjoy watching the weather through the window.");
        }else{
            System.out.println("It’s safe to go outside," + t + "degrees and sunny.");
        }
        
        if (snow && t > 100){
            System.out.println("I can't believe it's snowing at " + t +"degress!");
        }
    }
}



