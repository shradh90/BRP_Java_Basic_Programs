package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Utility {
    public static void monthDay(int month, int day) {
        boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
                || (month == 4 && day >=  1 && day <= 30)
                || (month == 5 && day >=  1 && day <= 31)
                || (month == 6 && day >=  1 && day <= 20);

        System.out.println(isSpring);
    }
    public double FindDelta(int a, int b, int c) {
        int delta = (b * b) - (4 * a * c);
        return delta;
    }


    public double QuadraticEquation1(int a, int b, double delta) {
        double absDelta = Math.abs(delta);
        double sqrtDelta = Math.sqrt(absDelta);
        double equation1 = (-b + sqrtDelta) / (2 * a);
        return equation1;
    }


    public double QuadraticEquation2(int a, int b, double delta) {
        double absDelta = Math.abs(delta);
        double sqrtDelta = Math.sqrt(absDelta);
        double equation2 = (-b - sqrtDelta) / (2 * a);
        return equation2;

    }
    public static void mathOpt(int a, int b, int c) {
        //int a=20, b=50, c=70;
        int operation1= a + b * c;
        int operation2= a * b + c;
        int operation3= c + a / b;
        int operation4= a % b + c;

        System.out.println("Operation 1 (a + b * c): "+operation1);
        System.out.println("Operation 2 (a * b + c): "+operation2);
        System.out.println("Operation 3 (c + a / b): "+operation3);
        System.out.println("Operation 4 (a % b + c): "+operation4);
    }
    public double EuclideanDistance(int x1, int y1, int x2, int y2) {
        double distance, powerofx, powerofy, sumOfPowerXY;
        int x, y;
        x = x2 - x1;
        y = y2 - y1;
        powerofx = Math.pow(x,2);
        powerofy = Math.pow(y, 2);
        sumOfPowerXY = powerofx + powerofy;
        distance = Math.sqrt(sumOfPowerXY);
        return distance;
    }
    public static void dice() {
        int a = 1 + (int) (Math.random() * 6);
        int b = 1 + (int) (Math.random() * 6);
        int sum = a + b;

        System.out.println("First of Dice :: " +a);
        System.out.println("Second of Dice :: " +b);
        System.out.println("Sum of two Dice :: " +sum);
    }
    public int calculateDayOfWeek(int day, int month, int year) {
        int y1, x, m, d1;
        y1 = year - (14 - month) / 12;
        x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
        m = month + 12 * ((14 - month) / 12) - 2;
        d1 = (day + x + 31 * m / 12) % 7;
        return d1;
    }
    public static void randomMinMax(){
        int number = 5;
        double random1 = Math.random();
        double random2 = Math.random();
        double random3 = Math.random();
        double random4 = Math.random();
        double random5 = Math.random();

        System.out.println("Random value 1 :: " +random1);
        System.out.println("Random value 2 :: " +random2);
        System.out.println("Random value 3 :: " +random3);
        System.out.println("Random value 4 :: " +random4);
        System.out.println("Random value 5 :: " +random5);

        double min     = Math.min(random1, Math.min(random2, Math.min(random3, Math.min(random4, random5))));
        double max     = Math.max(random1, Math.max(random2, Math.max(random3, Math.max(random4, random5))));
        double average = (random1 + random2 + random3 + random4 + random5) / number;

        System.out.println("Average = " + average);
        System.out.println("Min     = " + min);
        System.out.println("Max     = " + max);
    }
    public double CalculateWindChill(double temperature, double windspeed) {
        double a, windChill, b, c;
        a = 0.6215 * temperature;
        b = 0.4275 * temperature;
        c = b - 35.75;
        windChill = 35.74 + a + c * (Math.pow(windspeed, 0.16));
        // windchill cannot be negative
        windChill = Math.abs(windChill);
        return windChill;
    }
    public static void harmonicSeries(int num) {
        for ( int count = 1 ; count<= num ; count++ ) {
            if(count == num) {
                System.out.print(" 1/" +count);
            }
            else
                System.out.print(" 1/" +count+ " + ");
        }
    }

    public double findSquareRootUsingNewtonsMethod(int c) {
        double t, epsilon;
        t = c;  // estimate of the square root of c
        epsilon = 1e-15; // relative error tolerance
        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }
    public double FahrenheitToCelsius(double temperatureInFerenheit) {
        double temperatureInCelcius;
        temperatureInCelcius = ((temperatureInFerenheit - 32) * 5) / 9;
        return temperatureInCelcius;
    }

    public double CelsiusToFahrenheit(double temperatureInCelsius) {
        double temperatureInFahrenheit;
        temperatureInFahrenheit = ((temperatureInCelsius * 9) / 5) + 32;
        return temperatureInFahrenheit;
    }
    public static void SinCos(double degrees) {
        double radians = Math.toRadians(degrees);
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);

        System.out.println();
        System.out.println("sin(" +degrees+ ") =" +sinValue);
        System.out.println("cos(" +degrees+ ") =" +cosValue);
    }
    public void flipCoin(int numberOfTimesFlipCount) {
        int percentageOfHeads, percentageOfTails;
        int headsCounts = 0, tailsCounts = 0;
        for (int i = 0; i < numberOfTimesFlipCount; i++) {
            if (Math.random() > 0.5) {
                headsCounts++;
            } else {
                tailsCounts++;
            }
        }
        System.out.println("heads : " + headsCounts);
        System.out.println("tails : " + tailsCounts);
        // calculation of percentage
        percentageOfHeads = headsCounts * 100 / numberOfTimesFlipCount;
        percentageOfTails = tailsCounts * 100 / numberOfTimesFlipCount;

        System.out.println("Percentage for heads : " + percentageOfHeads);
        System.out.println("Percentage for tails : " + percentageOfTails);
    }
    public void gamlingSimulation(int stake, int goal, int times) {
        int tempStake = stake;
        int tempTime = times;
        int bets = 0;
        int win = 0, lose = 0;

        while (tempStake != 0 && tempStake != goal) {
            if (tempTime > -1) {
                if (tempStake != 0) {
                    if (win != goal) {
                        if (Math.random() > 0.5) {
                            tempStake++;
                            win++;
                            System.out.println("Won" + tempStake);
                        } else {
                            tempStake--;
                            lose++;
                            System.out.println("Loss" + tempStake);
                        }
                    } else {
                        System.out.println("Gamler reached to goal now withdraw money");
                        break;
                    }

                } else {
                    System.out.println("Stake amount is 0 not able to play now");

                }

            } else {
                System.out.println("Played n times");
                break;
            }
            tempTime--;
            bets++;

        }
        int perOfWin = win * 100 / bets;
        int perOfLose = lose * 100 / bets;

        System.out.println("Percentage of win : " + perOfWin);
        System.out.println("Percentage of loose : " + perOfLose);
    }
    public static void powerOf(int n) {
        for(int i = 1; i<=n;i++) {
            System.out.println(Math.pow(2,i));
        }
    }
    public static void range(int end, int start) {
        int count;
        //loop for finding and printing all prime numbers between given range
        for(int i = start ; i <= end ; i++)
        {
            //logic for checking number is prime or not
            count = 0;
            for(int j = 1 ; j <= i ; j++)
            {
                if(i % j == 0)
                    count = count+1;
            }
            if(count == 2)
                System.out.println(i);
        }
    }
    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if (str1.length() != str2.length()) {
            return false;
        } else {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }
        return false;
    }
    public static void printCalendar(int day, int days) {

        String[][] cal = new String[6][7];
        int temp;
        String weekdaystr = "SUN MON TUE WED THU FRI SAT";
        System.out.println(weekdaystr);
        switch (day) {
            case 0:
                temp = 1;
                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (temp <= 9) {
                            cal[i][j] = temp + "   ";
                        } else {
                            cal[i][j] = temp + "  ";
                        }
                        temp++;
                        if (temp == days + 1) {
                            break;
                        }
                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
            case 1:
                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j == 0) {
                            cal[i][j] = "    ";
                        } else {
                            if (i <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }

                }
                break;
            case 2:
                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j == 0 || i == 0 && j == 1) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }

                }
                break;
            case 3:
                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j >= 0 || i == 0 && j <= 2) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
            case 4:

                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j >= 0 || i == 0 && j <= 3) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
            case 5:

                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j >= 0 || i == 0 && j <= 4) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
            case 6:

                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j >= 0 || i == 0 && j <= 5) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
        }
        for (int i = 0; i < cal.length; i++) {
            for (int j = 0; j < cal[i].length; j++) {
                if (cal[i][j] == null)
                    break;
                System.out.print(cal[i][j]);
            }
            if (cal[i] == null)
                break;
            System.out.println();
        }
    }
    public static int calculateDay_Of_Week(int day, int month, int year) {
        int y1, x, m, d1;
        y1 = year - (14 - month) / 12;
        x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
        m = month + 12 * ((14 - month) / 12) - 2;
        d1 = (day + x + 31 * m / 12) % 7;
        return d1;
    }

    public static boolean is_LeapYear(int year) {
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0)
            return true;
        else
            return false;
    }


}
