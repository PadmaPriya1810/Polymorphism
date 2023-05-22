package Oops.Polymorphism;

//IS-A Not Mandatory

//Constructor is Always a Non-Static Member
//In a Class, Multiple Constructors having Same Name But Different In Formal Arguments

//Formal Arguments may different in TYPE or NUMBER

public class CTP_ConstructorOverloading_NonStatic {

	int a;
	int b;
	
	CTP_ConstructorOverloading_NonStatic()//Same Constructor Name But Diff in Formal Args
	{
		System.out.println("No Args Constructor");
	}
	
	CTP_ConstructorOverloading_NonStatic(int a)
	{
		this.a=a;
		System.out.println(a);
	}
	CTP_ConstructorOverloading_NonStatic(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		CTP_ConstructorOverloading_NonStatic co=new CTP_ConstructorOverloading_NonStatic();
		CTP_ConstructorOverloading_NonStatic co1=new CTP_ConstructorOverloading_NonStatic(3);
		CTP_ConstructorOverloading_NonStatic co2=new CTP_ConstructorOverloading_NonStatic(3,6);
	}
}
