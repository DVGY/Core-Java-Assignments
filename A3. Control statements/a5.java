// Write a program to check the given number is prime or not?


import java.util.Scanner;

class a5{


	public static void main(String args[])
	{
	double num,count;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	num = sc.nextDouble();
	count = 0;
	for(int i =1;i<=num;i++)
	{
		if(num %i == 0 )
		count++;
	}	

	if(count == 2)
	System.out.println("Number "+ num+" is prime");	
	else
	System.out.println("Number "+ num+" is  not prime");

	}

}
