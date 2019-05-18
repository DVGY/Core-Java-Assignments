/* 
 (Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display
the future day of the week.

*/

import java.util.Scanner;

class a16{
	public static void main(String args[]){
	int day,newDay;
	String futureDay;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the today's day of week in integer: ");
	day = sc.nextInt();

	System.out.print("Enter the Future day of week in integer: ");
	newDay = sc.nextInt();
	

	switch(day) 
	{
		case 0: futureDay = "Sunday";
			break;
		case 1: futureDay = "Monday";
			break;
		case 2: futureDay = "Tuesday";
			break;
		case 3: futureDay = "Wednesday";
			break;
		case 4: futureDay = "Thursday";
			break;

		case 5: futureDay = "Friday";
			break;

		case 6: futureDay = "Saturday";
			break;
		default: System.out.print("Invalid !! ");

 
	}

	int newcalDay = (day+newDay) % 7;

	if(newcalDay == 0)
		System.out.println("Future day of week is Sunday");	

	if(newcalDay == 1)
		System.out.println("Future day of week is Monday");
	
	if(newcalDay == 2)
		System.out.println("Future day of week is Tuesday");
	if(newcalDay == 3)
		System.out.println("Future day of week is Wednesday");
	if(newcalDay == 4)
		System.out.println("Future day of week is Thursday");
	if(newcalDay == 5)
		System.out.println("Future day of week is Friday");
	if(newcalDay == 6)
		System.out.println("Future day of week is Saturday");
	
		
		
	
	}

}


