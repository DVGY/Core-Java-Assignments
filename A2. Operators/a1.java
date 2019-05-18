/*(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32*/

import java.util.Scanner;

class a1{
	public static void main(String args[]){
	double celcius,farenheit;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the temprature: ");
		
	celcius = sc.nextDouble();

	farenheit = 9.0/5*celcius +32;

	System.out.println("Temprature in farenheit is: "+ farenheit);
		
	
	}


}
