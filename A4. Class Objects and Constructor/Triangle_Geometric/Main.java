/*
************************************
* GeometricObject                   *
*-----------------------------------*
* -color: String                    *
* -filled: boolean                  *
* -dateCreated: java.util.Date      *
*-----------------------------------*
* +GeometricObject()                *
* +GeometricObject(color: String,   *
*	filled: boolean)            *
* +getColor(): String               *
* +setColor(color: Stirng): void    *
* +isFilled(): boolean              *
* +setFilled(filled: boolean): void *
* +getDateCreated(): java.util.Date *
* +toString(): String               *
*********************************** *
(The Triangle class) Design a class named Triangle that extends               
 GeometricObject. The class contains:                                           
 Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.                            
 Š A no-arg constructor that creates a default triangle.                        
 Š A constructor that creates a triangle with the specified side1, side2, and  
   side3.                                                                                                                                                   
 Š The accessor methods for all three data fields.                            
 Š A method named getArea() that returns the area of this triangle.             
 Š A method named getPerimeter() that returns the perimeter of this triangle.   
 Š A method named toString() that returns a string description for the triangle.
                                                                                
The toString() method is implemented as follows:                         
                                                                                
 return "Triangle: side1 = " + side1 + " side2 = " + side2 +                    
 " side3 = " + side3;  */
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	{
  
	 Scanner sc = new Scanner(System.in);
	 geometricObject object = new geometricObject("Blue",true);
	 System.out.println(object.toString());
	
	 triangleClass object2 = new triangleClass();
	 System.out.println(object2.toString());
	 System.out.println(object2.getArea());
	 System.out.println(object2.getPerimeter());


	 System.out.println("\nEnter Triangle data ");
	 System.out.println("\nEnter side one: ");
	
	 double s1 = sc.nextDouble();
	 System.out.println("\nEnter side two: ");
	
	 double s2 = sc.nextDouble();
	
         System.out.println("\nEnter side three: ");
	
	 double s3 = sc.nextDouble();

	 System.out.println("\nEnter Color: ");
	
	 String color = sc.next();
   
         System.out.println("\nIs filled: ");
	
	 boolean fill = sc.nextBoolean();
	
	 object2.setColor(color);
         object2.setFilled(fill);

         System.out.println(object2.toString());
	 System.out.println(object2.getArea());
	 System.out.println(object2.getPerimeter());


         
         

	}
}

