/*

(Random month) Write a program that randomly generates an integer between 1
and 12 and displays the English month name January, February, …, December for
the number 1, 2, …, 12, accordingly.
*/
import java.util.Random;

class a16{
	public static void main(String args[])
	{
	Random rand = new Random();
	int n = rand.nextInt(12) +1;
	System.out.print("Number generated is: "+n);
	switch(n)
	{
		case 1: System.out.print(" Jan");
			break;
		case 2: System.out.print(" Feb");
			break;
		case 3: System.out.print(" Mar");
			break;

		case 4: System.out.print(" April");
			break;
		case 5: System.out.print(" May");
			break;
		case 6: System.out.print(" June");
			break;

		case 7: System.out.print(" July");
			break;

		case 8: System.out.print(" Aug");
			break;

		case 9: System.out.print(" Sep");
			break;
		case 10: System.out.print(" Oct");
			break;

		case 11: System.out.print(" Nov");
			break;
		case 12: System.out.print(" Dec");
			break;

		default: System.out.print(" Invalid number !!");
	}
		
	}

}
