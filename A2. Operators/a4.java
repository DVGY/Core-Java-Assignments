/* (Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93*/

import java.util.Scanner;

class a4{
	public static void main(String args[]){
	int num,count=0,mod ;

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number between 0 and 1000: ");
	num =sc.nextInt();	

	for(int i =0; i<3;i++){
		
	mod = num % 10;
	count += mod;
	num = num/10;
	
	
	}
		
	System.out.print("Count of number is: "+ count);

	}


}
