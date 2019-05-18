/*Write a program to Find Largest Number Among Three Numbers
Input three number from user and compare these number with each others and find largest number among these three numbers. */ 



import java.util.Scanner;

class a10{
	public static void main(String args[]){
	int a,b,c;
	int Largest ;
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the number 1: ");
	a = sc.nextInt();

	System.out.print("\nEnter the number 2: ");
	b = sc.nextInt();

	System.out.print("\nEnter the number 3: ");
	c = sc.nextInt();

	Largest = (a>b)?( a>c?a:c ):(b>c?b:c);
	System.out.println("Largest element is: "+ Largest);


}
}
