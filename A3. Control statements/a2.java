//. Write a program to find given number is odd or even?



import java.util.Scanner;


class a2{
	public static void main(String args[])
	{
	double num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the num: ");
	num = sc.nextInt();
	if(num%2==0)
	System.out.println("Number "+(int)num+ "is even");
	else
	System.out.println("Number "+(int)num+ "is odd");
		
	}


}
