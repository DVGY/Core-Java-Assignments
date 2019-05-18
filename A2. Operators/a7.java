/*(Geometry: distance of two points) Write a program that prompts the user to enter
two points (x1, y1) and (x2, y2) and displays their distance between them.*/

import java.util.Scanner;

class a7{
	public static void main(String args[]){
	double x1,x2,y1,y2,dist;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter point x1: " );
	x1 = sc.nextDouble();
		
	System.out.print("Enter point x2: " );
	x2 = sc.nextDouble();

	System.out.print("Enter point y1: " );
	y1 = sc.nextDouble();

	System.out.print("Enter point y2: " );
	y2 = sc.nextDouble();
	
	dist = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
	
	System.out.print("Distance between point is: "+ dist );


	}

}



