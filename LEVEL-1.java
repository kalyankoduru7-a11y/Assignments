LEVEL 1
1.Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
  I/P => NONE
  O/P => Harry's age in 2024 is ___ 
        Code:- 
                 // Program to find Harry's age in 2024
  public class HarryAge {
      public static void main(String[] args) {

        int birthYear = 2000;
        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.println("Harry's age in 2024 is " + age);
    }
}

       Harry's age in 2024 is 24


2.Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___ 
CODE:-
                 // Program to calculate average marks in PCM
public class AveragePCM {
    public static void main(String[] args) {

        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        double average = (maths + physics + chemistry) / 3.0;

        System.out.println("Sam's average mark in PCM is " + average);
    }
}

Sam's average mark in PCM is 95.0


3.Create a program to convert the distance of 10.8 kilometers to miles.
Hint: 1 km = 1.6 miles
I/P => NONE
O/P => The distance  ___ km in miles is ___

CODE:-
                 // Program to convert kilometers to miles
public class KmToMiles {
    public static void main(String[] args) {

        double kilometers = 10.8;
        double milesPerKm = 1.6;

        double miles = kilometers * milesPerKm;

        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}

The distance 10.8 km in miles is 17.28