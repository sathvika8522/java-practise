package shivaya;

abstract class A1
{
	static int i =1;
	final int j=2;
	abstract void dog();
	//or void dog(){};
	void cow()
	{
		System.out.println("ambaaaaaaaaa");
	}
}

class B1 extends A1
{
	static int a=10;
	final int b=20;
	void dog()
	{
		System.out.println("boww boww....");
	}
	void cow()
	{
		System.out.println("in child class ambaaaaaaaaa");
	}
	void display()
	{
		System.out.println("in child class  "+i+" "+j);
	}
}

public class abstractdemo {

	public static void main(String[] args) {
		B1 obj1=new B1();
		//A obj2=new A();
		obj1.dog();
		obj1.cow();
		obj1.display();
		System.out.println("----In main----");
		System.out.println("static "+obj1.i+" "+A1.i+" "+B1.a+" "+obj1.a);
		System.out.println("final "+obj1.j+" "+obj1.b);
		

	}

}
