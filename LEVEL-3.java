LEVEL 3 
1.Write a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit
Hint => 
Create a celsius variable and take the temperature as user input
Use the Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F and assign to farenheitResult  and print the result
I/P => celcius
O/P =>  The ____ celsius is _____ fahrenheit
 CODE:-      
  
            import java.util.Scanner;

// Program to convert Celsius to Fahrenheit
public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius + " celsius is " 
                + fahrenheitResult + " fahrenheit");
    }
}


Enter temperature in Celsius: 25
The 25.0 celsius is 77.0 fahrenheit


2.Write a TemperaturConversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius
Hint => 
Create a fahrenheit variable and take the user's input
User the formulae to convert Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C and assign the result to celsiusResult  and print the result
I/P => fahrenheit
O/P => The ____ fahrenheit is _____ celsius
CODE:-

                             import java.util.Scanner;

// Program to convert Fahrenheit to Celsius
public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit + " fahrenheit is "
                + celsiusResult + " celsius");
    }
}

Enter temperature in Fahrenheit: 77
The 77.0 fahrenheit is 25.0 celsius