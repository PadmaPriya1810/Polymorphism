package Oops.Polymorphism;

public class Ball
{
	private int radius;
	
	Ball()
	{}
	
	Ball(int radius)
	{
		this.radius=radius;
	}
	
	public int getRadius()
	{
		return radius;
	}

	public void setRadius(int OldRadius,int NewRadius)
	{
	if(this.radius==OldRadius)	
	{
		this.radius=NewRadius;
		System.out.println("Radius Changed!");
	}
	}
	
	public void detailsOfBall()
	{
		System.out.println("Radius of the Ball "+radius);
	}
}

class BasketBall extends Ball
{
	String game="Basketball";
	BasketBall()
	{}
	BasketBall(int radius)
	{
		super(radius);
	}
}

class Tennis extends Ball
{
	String game="Tennis";
	Tennis()
	{}
	Tennis(int radius)
	{
		super(radius);
	}
}

class Cricket extends Ball
{
	String game="Cricket";
	Cricket()
	{}
	Cricket(int radius)
	{
		super(radius);
	}
}