LEVEL 2
1.Write a program to create a basic calculator for addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication, and division assign the result to a variable, and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication, and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___

CODE:-                
                                       import java.util.Scanner;

// Program for basic calculator
public class BasicCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", "
                + multiplication + ", and " + division);
    }
}
   

Enter first number: 10
Enter second number: 5
The addition, subtraction, multiplication, and division value of 2 numbers 10.0 and 5.0 is 15.0, 5.0, 50.0, and 2.0




2.Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height and 1 in = 2.54 cm
I/P => base, height
O/P => The Area of the triangle in sq in is ___ and sq cm is ___

CODE:-                          
                   import java.util.Scanner;

// Program to find area of triangle
public class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaSqCm = 0.5 * base * height;
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is "
                + areaSqIn + " and sq cm is " + areaSqCm);
    }
}
Enter base in cm: 10
Enter height in cm: 5
The Area of the triangle in sq in is 7.750015500031 and sq cm is 25.0