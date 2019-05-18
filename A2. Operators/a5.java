/*(Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
For simplicity, assume a year has 365 days. */



/*import java.util.Scanner;


class a5{
	public static void main(String args[]){
	int min,year,day;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the minute: ");
	min = sc.nextInt();
	year = min/525600;
	day = (min/525600)%1440;
	
	System.out.print(min+ " minutes is: "+ year+" years and "+day+" days");		
	
	}

}*/

import java.util.Scanner;

public class a5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the number of minutes
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();

		// Compute the number of years and days
		int years = minutes / 525600;
		int days = (minutes % 525600) / 1440;

		// Display results
		System.out.println(minutes + " minutes is approximately " + years
			+ " years and " + days + " days");
	}
}
