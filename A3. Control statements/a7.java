/* Write a program to reverse number?
Description : Reverse number means reverse the position of all digits of any number. For example reverse of 839 is 938. 
Hint: For this program you need modulus operator concept and while loop, while loop is used for check condition and modulus used for find the remainder.
*/

import java.util.Scanner;

class a7{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int num,rem;
	int newnum=0;
	System.out.println("Enter the num: ");
	num =sc.nextInt(); 

	while(num >0)
	{		
		rem = num %10;
		newnum = (newnum*10) + rem;
		num /= 10;
	}
	System.out.println("Reversed number is: "+ newnum);

	}

}
