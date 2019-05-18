/*  (Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * pi
volume = area * length */

import java.util.Scanner;

class a2{
	
	static final double pi = 3.14;
	public static void main(String args[]){
	double area,volume,rad,height;
		

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter radius of cylinder: ");
	rad = sc.nextDouble();
	System.out.print("\nEnter height of cylinder: ");
	height = sc.nextDouble();
	area = rad*rad*pi;
	volume = area*height;
	System.out.println("Area of cylinder is : " + area);
	System.out.println("Volume of cylinder is : " + volume);
	

	}

}
