/*(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.
*/

import java.util.Scanner;


class a3{
	public static void main(String args[]){
	double subTotal,gratRate,tot;

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the total amount: ");
	subTotal = sc.nextDouble();

	System.out.print("\nEnter gratutity rate: ");
	gratRate = sc.nextDouble();
	double gratToCur = subTotal * (gratRate/100);
	tot = gratToCur + subTotal;
	System.out.println("Enter gratutity cost is: $"+ gratToCur);
	System.out.println("Total cost is: $"+ tot);
		
	
	}

}
