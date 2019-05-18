
/* Write a program to check the given number is palindrome or not?
Descritpion : A Palindrome number is a number that remains the same when its digits are reversed. Like 16461, for example: we take 121 and reverse it, after revers it is same as original number. */



 



import java.util.Scanner;

class a12{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int num,temp,rem,sum=0;

	System.out.println("Enter the number: ");
	num = sc.nextInt();
	temp = num;
	while(temp>0)
	{
		rem = temp%10;
		sum = (sum*10) + rem;
		temp /= 10;
		
	}
	if(sum == num)
	System.out.println("String is palindrome: ");	
	else
	System.out.println("String is  NOT palindrome: ");	

	}
}
