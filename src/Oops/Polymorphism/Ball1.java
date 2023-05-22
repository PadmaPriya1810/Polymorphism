package Oops.Polymorphism;

public class Ball1 {
	
	private int radius;
		
		Ball1()
		{
			
		}
		
		Ball1(int radius)
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

	class BasketBall1 extends Ball1
	{
		String game="Basketball";
		BasketBall1()
		{}
		BasketBall1(int radius)
		{
			super(radius);
		}
	}

	class Tennis1 extends Ball1
	{
		String game="Tennis";
		Tennis1()
		{}
		Tennis1(int radius)
		{
			super(radius);
		}
	}

	class Cricket1 extends Ball1
	{
		String game="Cricket";
		Cricket1()
		{}
		Cricket1(int radius)
		{
			super(radius);
		}
	}


