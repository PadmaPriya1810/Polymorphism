package Oops.Polymorphism;

//RTP-Dynamic Binding
//Providing New Implementation to the Inherited Member(Parent Class Member) from the Child Class
//IS-A Relationship is Mandatory
//Applicable for Non-Static Methods
//Coz Both the Members of Parent Class & Sub Class Loading in the Same Object,
//Parent Class member Overriden By Child Class Member
//Method Signature & Return Type should be Same
//Member will executed based on the Type of Object Created

public class RTP_MethodOverriding_NonStatic_Driver {
public static void main(String[] args) {
	
	Father f=new Father(); //Creating Object of Father
	f.property();
	f.marry();
	
	Son s=new Son();//Creating Object of Son
	s.property();
	s.marry();
	
	Father f1=new Son(); //Upcasting
	f1.marry();
		
	Son s1=(Son)f1; //Downcasting
	s1.marry();
}	
}

class Father
{
	public void property() 
	{
	System.out.println("House,Car,500000");	
	}
	
	public void marry()
	{
		System.out.println("Sheela");
	}
}

class Son extends Father
{
	@Override
	public void marry() //Overriding the Same Parent Class member
	{
		System.out.println("Mala"); //Providing New implementation to the Inherited Member in Child Class
	}
	
}