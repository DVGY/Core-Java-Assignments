/* (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
seconds. Write a program that displays the average speed in miles per hour. (Note
that 1 mile is 1.6 kilometers.) */

class a7{
	public static void main(String args[])
	{
		
		double min = 45;
		double sec = 30;
		double minToHour = min/60;
		double secToHour = sec/3600;
		double totalHour = minToHour + secToHour;

		double dist = 14;
		double totalMiles = dist/1.6;
		
		
	
		System.out.println("Average speed of runner: "+totalMiles/totalHour+" miles per hour");
		
	}

}
