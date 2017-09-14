public class HikingAdvice {

  public static void getHikingAdvice(int temperature, int windchill,  int humidity, String description){
       boolean fair= true;
       if (description == "fair" || description == "Fair" || description == "FAIR")
          System.out.println("You're in Santa Fe.");
       
       if (temperature>=65)  
           System.out.println("You're in San Jose.");


       if (windchill == 10)  
       	  System.out.println("Don’t go out!");
   
       if (humidity == 15)  
       	  System.out.println("It’s raining.");


       if (temperature >= 100)  
        	System.out.println("It’s hot");
  }
}
