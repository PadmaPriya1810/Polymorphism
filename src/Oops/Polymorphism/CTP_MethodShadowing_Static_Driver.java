package Oops.Polymorphism;

//CTP
// IS-A Relationship is Mandatory
// Applicable only for Static Methods
// Both Super Class & Sub Class having Same Static Method with the Same Method Declaration
public class CTP_MethodShadowing_Static_Driver {
	public static void main(String[] args) {
	
		SuperClass1.m1(); //From SuperClass
		SubClass1.m1(); //From SubClass
		
	
	SuperClass1 sup=new SuperClass1();//Creating Obj For Parent Class
	sup.m1(); //From SuperClass
	
	SubClass1 sub=new SubClass1();//Creating Obj For Sub Class
	sub.m1(); //From SubClass
	
	SuperClass1 sup1=new SubClass1();//UPCASTING
	sup1.m1(); //From SuperClass
	
	SubClass1 sub1=(SubClass1)sup1;//DOWNCASTING
	sub1.m1(); //From SubClass
	
	}
}
class SuperClass1
{
	public static void m1()
	{
		System.out.println("From SuperClass");
	}
}

class SubClass1 extends SuperClass1
{
	//public static void m1(); --Inherited From SuperClass also there
	
	public static void m1()//Duplicate Method -Stores in Different CSA
	{
		System.out.println("From SubClass");
	}
}