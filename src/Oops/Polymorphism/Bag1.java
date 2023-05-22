package Oops.Polymorphism;
import java.util.Scanner;
public class Bag1 {
		static Scanner sc=new Scanner(System.in);
		
	Ball1 b;//Putting Ball class inside Bag

	public void addBall(Ball1 b)
	{
		
		if(this.b==null)
		{
			this.b=b;
			System.out.println("Ball Added Successfully");	
		}
		else
		{
			System.out.println("Ball is Already there in the Bag.");
		}
	}

	public void removeBall(Ball1 b)
	{
		if(this.b==null)
		{
			System.out.println("No Ball is there to Remove.");
		}
		else
		{
			this.b=null;
			System.out.println("Ball Removed Successfully.");
		}	
	}

	public void isBagEmpty(Ball1 b)
	{
		if(this.b==null)
		{
			System.out.println("Bag is Empty.");
		}
		else
		{
			System.out.println("Bag is Not Empty.Already Ball Added");
		}
	}
	public void showGame(Ball1 b)
	{
		if(b instanceof Cricket1)
		{
			Cricket1 c=(Cricket1)b;
			System.out.println(c.game);
		}
		else if(b instanceof BasketBall1)
		{
			BasketBall1 bb=(BasketBall1)b;
			System.out.println(bb.game);
		}
		else if(b instanceof Tennis1)
		{
			Tennis1 t=(Tennis1)b;
			System.out.println(t.game);
		}
		else
		{
			System.out.println("Please Add Ball First");
		}
	}
	}


