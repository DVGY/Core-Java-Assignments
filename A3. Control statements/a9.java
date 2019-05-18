/*Write a program to check given number is Armstrong number or not?
Description: Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits is equal to the number itself. */

import java.util.Scanner;

class a9{
	public static void main(String args[]){
	int num,count=0,rem;
	int sumArm =0 ;
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the number: ");
	num = sc.nextInt();

	int countDigit = num;	
	while(countDigit>0)
	{
		rem = countDigit%10;
		countDigit /= 10;
		count++;	
		
	}	
	countDigit = num;
	while(countDigit>0)	
	{
		rem = countDigit%10;
		sumArm += Math.pow(rem,count);
		countDigit /= 10;
	}

	if(sumArm == num)
	System.out.print(" Number "+num+" is an Armstrong number.");
	else
	System.out.print(" Number "+num+" is NOT an  Armstrong number. ");	



	}


}
