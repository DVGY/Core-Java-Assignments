public class triangleClass extends geometricObject
{
 	private double side1;
	private double side2;
	private double side3;

	triangleClass()
	{
			side1=side2=side3=1.0;
	}
	
	triangleClass(double s1,double s2,double s3)
	{
			this.side1=s1;
			this.side2=s2;
			this.side3=s3;
	}

	double getArea()
	{
		double perimeter = (side1+side2+side3)/2;
		return Math.pow( perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3),0.5);
	}
	
	double getPerimeter()
	{
		return side1+side2+side3;
	}

	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +                    
 " side3 = " + side3+"\nTriangle color: "+getColor()+"\nIs traingle filled: "+isFilled();
	}

	
}
