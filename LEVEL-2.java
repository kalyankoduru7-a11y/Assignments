 LEVEL-2                                         

Create a program to print odd and even numbers between 1 to the number entered by the user.
Hint => 
Get an integer input from the user, assign to a variable number and check for Natural Number
Using a for loop, iterate from 1 to the number
In each iteration of the loop, print the number is odd or even number

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        for(int i = 1; i <= number; i++) {
            if(i % 2 == 0)
                System.out.println(i + " is Even");
            else
                System.out.println(i + " is Odd");
        }
    }
}

Enter a number: 5
1 is Odd
2 is Even
3 is Odd
4 is Even
5 is Odd

2.Create a program to find the bonuses of employees based on their years of service.
Hint => 
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float salary, bonus;
        int years;

        System.out.print("Enter salary: ");
        salary = sc.nextFloat();

        System.out.print("Enter years of service: ");
        years = sc.nextInt();

        if(years > 5) {
            bonus = salary * 0.05f;
            System.out.println("Bonus amount: " + bonus);
        }
        else {
            System.out.println("No bonus");
        }
    }
}


Enter salary: 20000
Enter years of service: 6
Bonus amount: 1000