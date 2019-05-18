/* (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.) */

class a8{
	public static void main(String args[])
	{
		double hour = 1;
		double min = 40;
		double sec = 35;
		double minToHour = min/60;
		double secToHour = sec/3600;
		double totalHour = hour + minToHour + secToHour;

		double dist = 24;
		double totalkm = dist*1.6;
		
		
	
		System.out.println("Average speed of runner: "+totalkm/totalHour+" kilometer per hour");
		
	}

}
