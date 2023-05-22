package Oops.Polymorphism;

import java.util.Scanner;

public class BallBagDriver1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		Bag1 bag=new Bag1();//Created Object for Bag
		boolean loop=true;
		
		System.out.println("****** Welcome *******");
		boolean gameloop=true;
		do
		{
		System.out.println("Enter The Game You Wanna Play:\n 1. Basketball\n 2. Tennis\n 3. Cricket\n 4. Exit");
		int game=sc.nextInt();

		switch(game)
		{
		case 1:
		{
		System.out.println("Enter the Radius Of the Ball");//User-Enter the radius of the ball
		int r=sc.nextInt();
		Ball1 b=new BasketBall1(r);
		do {
		System.out.println("Enter Your Choice:\n 1. Add Ball\n 2. Remove Ball\n 3. Check Bag is Empty Or Not\n 4. Show Game\n 5. Exit");
		int choice =sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{	
			bag.addBall(b);//Passing Ref.Var of Ball inside addBall()
		}
		break;
		
		case 2:
		{
			bag.removeBall(b);
		}
		break;
		
		case 3:
		{
			bag.isBagEmpty(b);
		}
		break;
		
		case 4:
		{
			bag.showGame(b);	
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
		break;
		
		case 2:
		{
		System.out.println("Enter the Radius Of the Ball");//User-Enter the radius of the ball
		int r=sc.nextInt();
		Ball1 b=new Tennis1(r);
		do {
		System.out.println("Enter Your Choice:\n 1. Add Ball\n 2. Remove Ball\n 3. Check Bag is Empty Or Not\n 4. Show Game\n 5. Exit");
		int choice =sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{	
			bag.addBall(b);//Passing Ref.Var of Ball inside addBall()
		}
		break;
		
		case 2:
		{
			bag.removeBall(b);
		}
		break;
		
		case 3:
		{
			bag.isBagEmpty(b);
		}
		break;
		
		case 4:
		{
			bag.showGame(b);	
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
		break;
		case 3:
		{
		System.out.println("Enter the Radius Of the Ball");//User-Enter the radius of the ball
		int r=sc.nextInt();
		Ball1 b=new Cricket1(r);
		do {
		System.out.println("Enter Your Choice:\n 1. Add Ball\n 2. Remove Ball\n 3. Check Bag is Empty Or Not\n 4. Show Game\n 5. Exit");
		int choice =sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{	
			bag.addBall(b);//Passing Ref.Var of Ball inside addBall()		
		}
		break;
		
		case 2:
		{
			bag.removeBall(b);
		}
		break;
		
		case 3:
		{
			bag.isBagEmpty(b);
		}
		break;
		
		case 4:
		{
			bag.showGame(b);	
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
		break;
		case 4:
		{
			gameloop=false;
			System.out.println("Thank You!");
		}
		break;
		default:
		{
		System.out.println("Invalid Choice");
		}
		}
		}
	
	while(gameloop);
	}
	}





