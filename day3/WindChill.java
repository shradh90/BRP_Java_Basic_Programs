package com.company.day3;
import com.company.Utility;


public class WindChill {
    public static void main(String[] args) {
        Utility utility = new Utility();

        double windspeed, temperatureInFahrenheit = 0, windChill;
        temperatureInFahrenheit = Double.parseDouble("40");

        windspeed = Double.parseDouble("60");

        windChill = utility.CalculateWindChill(temperatureInFahrenheit, windspeed);
        System.out.println("By Calculating wind chill is: " + windChill);
    }

}
