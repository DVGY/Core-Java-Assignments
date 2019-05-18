/*(Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
*/

import java.util.Scanner;


class a6{
	public static void main(String args[]){
	double height,weight, h1,w1,BMI;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the height: ");
	height = sc.nextInt();
	System.out.print("Enter the weight: ");
	weight = sc.nextInt();
	w1 = 0.45359237*weight;
	h1 = 0.0254* height;
	BMI = weight/Math.pow(height,2);
	
	System.out.print("BMI of the person is: "+BMI);		
	
	}

}
