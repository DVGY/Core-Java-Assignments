/*
(Find numbers divisible by 5 and 6) Write a program that displays all the numbers
from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are
separated by exactly one space.


*/


import java.util.Scanner;

class a23{
	public static void main(String args[]){
	final int perLine = 10;	
	
	Scanner sc = new Scanner(System.in);
	int count =0;
	for(int i = 100; i<= 1000 ;i++)
	{
	
		if(i %5 == 0 && i % 6 ==0)
		{
		
		count++;
			
			if(count % perLine == 0)
				System.out.println(i);
			else
				
				System.out.print(i+ " ");

		}	
		
		
	}
	
	

}

}
