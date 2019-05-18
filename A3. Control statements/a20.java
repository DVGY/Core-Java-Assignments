/*

(Count positive and negative numbers and compute the average of numbers) Write
a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0. Display
the average as a floating-point number.

*/

import java.util.Scanner;

class a20{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int num=-1;
	int negCount=0 ;
	int posCount=0;
	float average = 0.0f;

	while(num!=0)
	{
	System.out.println("Enter numbers: ");	
	num = sc.nextInt();
		if(num <0)
		{
			negCount++;
		average += num;	
		}
		else if(num >0 )
	        {	
			posCount++;
		average += num;	
		}
		


	}
	System.out.print("Positive numbers are: " +posCount+ "\n Negative numbers are " +negCount);
	System.out.println("\nTotal is: "+(int)average);
	System.out.println("Average is: "+(float) (average/(posCount+negCount) ) );

	
		
	}

}
