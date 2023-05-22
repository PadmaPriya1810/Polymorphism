package Oops.Polymorphism;

import java.util.Scanner;

public class Ball_Bag_Driver {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		Bag bag=new Bag();//Created Object for Bag
		boolean loop=true;
		
		do {
		System.out.println("****** LET'S PLAY! *******");
		System.out.println("Enter Your Choice:\n 1. Add Ball\n 2. Remove Ball\n 3. Check Bag is Empty Or Not\n 4. Show Game\n");
		int choice =sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter The Game You Wanna Play:\n 1. Basketball\n 2. Tennis\n 3. Cricket\n");
			int game=sc.nextInt();
		
			switch(game)
			{
			case 1:
			{
			System.out.println("Enter the Radius Of the Ball");//User-Enter the radius of the ball
			int r=sc.nextInt();
			Ball b=new BasketBall(r);//UPCASTING Creating Object for Basket Ball and Storing in Ref type of Ball
			bag.addBall(b);//Passing Ref var of Ball to addBall //Initializing Global Var Ball b as BasketBall
			}
			break;
			case 2:
			{
			System.out.println("Enter the Radius Of the Ball");//User-Enter the radius of the ball
			int r=sc.nextInt();
			Ball b=new Tennis(r);//UPCASTING Creating Object for Tennis and Storing in Ref type of Ball
			bag.addBall(b);//Passing Ref var of Ball to addBall //Initializing Global Var Ball b as Tennis
			}
			break;
			case 3:
			{
			System.out.println("Enter the Radius Of the Ball");//User-Enter the radius of the ball
			int r=sc.nextInt();
			Ball b=new Cricket(r);//UPCASTING Creating Object for Cricket and Storing in Ref type of Ball
			bag.addBall(b);//Passing Ref var of Ball to addBall //Initializing Global Var Ball b as Cricket
			}
			break;
			default:
			{
			System.out.println("Invalid Choice");
			}
			}
		}
		break;
		
		case 2:
		{
			bag.removeBall();//No need to pass Ball b Argument. Since by addBall() Global variable is Initialized
		}
		break;
		
		case 3:
		{
			bag.isBagEmpty();
		}
		break;
		
		case 4:
		{
			bag.showGame();//We can directly use No arg.. No Need Parameterized helper() B'coz Global variable Ball b is Initialized using bag.adddBall(b) helper()
		}
		break;
		
		case 5:
		{
			loop=false;
		}
		break;
		
		default:
		{
			System.out.println("Enter the Valid Option");
		}
		}
		}
		while(loop);
	}
}

