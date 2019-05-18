//3. Write a java program to swap two variables?


import java.util.Scanner;

class a3{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);	
	double num1,num2,temp;
	System.out.println("Enter number one: ");
	num1 = sc.nextDouble();
	System.out.println("Enter number two: ");
	num2 = sc.nextDouble();
	
	temp = num1;
	num1 = num2;
	num2 = temp;


	System.out.println("Number after swap ");
	System.out.println("Number 1: " + num1+ "\nNumber 2: "+num2);

	}

}
