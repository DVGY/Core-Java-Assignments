/*  Write a program to find factorial?
    Description: Factorial of any number is the product of an integer and all the integers below it for example
    factorial of 4 is 4! = 4 * 3 * 2 * 1 = 24.*/ 

import java.util.Scanner;

class a6{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int num,fact=1;
	System.out.println("Enter the num: ");
	num =sc.nextInt(); 
		
	if(num ==0)
	System.out.println("Factorial of number is: 1");	
	while(num!=1)	
	{
		

		fact =fact*num;
		num--;
		
	}
	System.out.println("Factorial of number is: "+fact);
	
	}

}
