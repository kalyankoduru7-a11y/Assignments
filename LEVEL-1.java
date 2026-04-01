 LEVEL-1                                       
Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___
import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if(number % 5 == 0)
            System.out.println("Is the number divisible by 5? Yes");
        else
            System.out.println("Is the number divisible by 5? No");
    }
}


Enter a number: 25
Is the number divisible by 5? Yes


2.  Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____
import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1, number2, number3;

        System.out.print("Enter three numbers: ");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();

        if(number1 < number2 && number1 < number3)
            System.out.println("Is the first number the smallest? Yes");
        else
            System.out.println("Is the first number the smallest? No");
    }
}



Enter three numbers: 2 5 9
Is the first number the smallest? Yes



3.Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P => 
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___


import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1, number2, number3;

        System.out.print("Enter three numbers: ");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();

        if(number1 > number2 && number1 > number3)
            System.out.println("Is the first number the largest? Yes");
        else
            System.out.println("Is the first number the largest? No");

        if(number2 > number1 && number2 > number3)
            System.out.println("Is the second number the largest? Yes");
        else
            System.out.println("Is the second number the largest? No");

        if(number3 > number1 && number3 > number2)
            System.out.println("Is the third number the largest? Yes");
        else
            System.out.println("Is the third number the largest? No");
    }
}


Enter three numbers: 4 10 7
Is the first number the largest? No
Is the second number the largest? Yes
Is the third number the largest? No