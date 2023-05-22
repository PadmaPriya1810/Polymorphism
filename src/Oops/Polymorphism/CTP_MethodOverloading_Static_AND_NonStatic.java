package Oops.Polymorphism;
//IS-A Not Mandatory

//Both Static & Non-Static Methods

//In a Class, Multiple Methods having Same Name But Different In Formal Arguments

//Formal Arguments may different in TYPE or NUMBER

public class CTP_MethodOverloading_Static_AND_NonStatic {
	
	public static void staticMethod()
	{
		System.out.println("From Static Method 1");
	}
	public static void staticMethod(int a)//Same Static Method But Diff Formal Args.
	{
		System.out.println("From Static Method 2");
	}

	public void nonStaticMethod()
	{
		System.out.println("From Non-Static Method 1");
	}
	
	public void nonStaticMethod(int a)
	{
		System.out.println("From Non-Static Method 2");//Same NS Method But Diff Formal Args
	}
	
	public static void main(String[] args) {
		staticMethod();
		staticMethod(1);
		
		CTP_MethodOverloading_Static_AND_NonStatic mo=new CTP_MethodOverloading_Static_AND_NonStatic();
		mo.nonStaticMethod();
		mo.nonStaticMethod(1);
	}
}
