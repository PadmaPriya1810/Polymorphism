package Oops.Polymorphism;

//IS-A Relationship Mandatory (INHERITANCE)

//Both Static & Non-Static Variables

//Super Class & Sub Class having Same Variable with Different Values

//Using UPCASTING & DOWNCASTING

//Executed Based on Type Of Ref.Variable (LHS)-CTP

public class CTP_VariableShadowing_Static_And_NonStatic_DRIVER {

	public static void main(String[] args) {
		SuperClass sup=new SuperClass();//Creating Obj For Parent Class
		System.out.println(sup.a); //5
		
		SubClass sub=new SubClass();//Creating Obj For Sub Class
		System.out.println(sub.a); //10
		
		SuperClass sup1=new SubClass();//UPCASTING
		System.out.println(sup1.a); //5
		
		SubClass sub1=(SubClass)sup1;//DOWNCASTING
		System.out.println(sub1.a); //10
	}
}
 class SuperClass
 {
	 int a=5;
 }
 
 class SubClass extends SuperClass
 {
	 int a=10;
 }
 
 