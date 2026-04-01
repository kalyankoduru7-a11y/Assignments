LEVEL-3                                                
Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same. 
Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
Write code having multiple if else statements based on conditions provided above and a second part having only one if statement and multiple logical 

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;

        System.out.print("Enter a year: ");
        year = sc.nextInt();

        if(year < 1582) {
            System.out.println("Invalid year for Gregorian calendar");
        }
        else if(year % 400 == 0) {
            System.out.println("The year is a Leap Year");
        }
        else if(year % 100 == 0) {
            System.out.println("The year is NOT a Leap Year");
        }
        else if(year % 4 == 0) {
            System.out.println("The year is a Leap Year");
        }
        else {
            System.out.println("The year is NOT a Leap Year");
        }
    }
}



Enter a year: 2000
The year is a Leap Year

2.Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators


import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;

        System.out.print("Enter a year: ");
        year = sc.nextInt();

        if(year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("The year is a Leap Year");
        }
        else {
            System.out.println("The year is NOT a Leap Year");
        }
    }
}



Enter a year: 2024
The year is a Leap Year