/*
(Find the factors of an integer) Write a program that reads an integer and displays
all its smallest factors in increasing order. For example, if the input integer is
120, the output should be as follows: 2, 2, 2, 3, 5.


*/


import java.util.Scanner;

class a25{
	public static void main(String args[]){
	int num,index =2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	num = sc.nextInt();
	while(num/index !=1)
	{
		if(num%index == 0)
		{
			System.out.print(index+", ");
			num/= index;
			
			
			
		}
		else
		{
		index++;}

	}

	System.out.println(num+" ");	
	
	}


}
