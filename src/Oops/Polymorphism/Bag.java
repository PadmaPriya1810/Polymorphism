package Oops.Polymorphism;

import java.util.Scanner;

public class Bag {
	static Scanner sc=new Scanner(System.in);
	
Ball b;//Putting Ball class inside Bag

public void addBall(Ball b)
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

public void removeBall()
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

public void isBagEmpty()
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
public void showGame()
{
	if(b instanceof Cricket)
	{
		Cricket c=(Cricket)b;
		System.out.println(c.game);
	}
	else if(b instanceof BasketBall)
	{
		BasketBall bb=(BasketBall)b;
		System.out.println(bb.game);
	}
	else if(b instanceof Tennis)
	{
		Tennis t=(Tennis)b;
		System.out.println(t.game);
	}
	else
	{
		System.out.println("Please Add Ball First");
	}
}
}
