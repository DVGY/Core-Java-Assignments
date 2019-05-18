//Write a program to Swap two numbers without using third variable?

import java.util.Scanner;

class a4{
	public static void main(String args[])
	{	
	double num1,num2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number one: ");
	num1 = sc.nextDouble();
	System.out.println("Enter number two: ");
	num2 = sc.nextDouble();
	
	num1 = num1 + num2;
	num2 = num1 - num2;
	num1 = num1 - num2;


	System.out.println("Number after swap ");
	System.out.println("Number 1: " + num1+ "\nNumber 2: "+num2);

	}

}
