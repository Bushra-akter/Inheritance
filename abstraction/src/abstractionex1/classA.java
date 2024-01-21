package abstractionex1;

public abstract class classA {  //abstract clASS IS FOR TOPLEVEL OR OUTER CLASS
	
	abstract void show();// abstract method cannot have any body. //final and static are not use.
	classA()
	{
		System.out.println("hello from class A constructor");
	}
	void y()
	{
		   System.out.println("just concrete method in abstract class a");
	}
	
	static void st()
	{
		System.out.println("static mehhod in abstract class A");
	}
   
   
}

//abstract class a sob kichu thakte pare(abstract method,concreate method,constructor(default,perametarized)).  but abstract method a shudo matro name ta thakbe,,kono body thakbe na.
