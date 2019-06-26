import java.util.Date;


public class geometricObject
{
	private String color;
 	private boolean filled;
	Date dateCreated;
	
	geometricObject()
	{
         dateCreated=new Date();
	}

	geometricObject(String col, boolean fill)
	{
                dateCreated=new Date();
		this.color=col;
		this.filled=fill;
	}

	String getColor()
	{
		return color;
	}

	void setColor(String col)
	{
		color=col;
	}

	boolean isFilled()
	{
		return filled;
	}

	void setFilled(boolean fill)
	{
			filled=fill;
	}
	
	Date getDateCreated()
	{
		return dateCreated;
	}

	public String toString()
	{
		return (filled)?("Geometric Obejct color: "+ color+"\nDate of creation "+ dateCreated+"\nFilled: "+filled):("\nDate of creation "+ dateCreated+"\nFilled : "+filled+ "Color: "+color);
				
	}

}






























