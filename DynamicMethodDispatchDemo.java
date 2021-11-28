package javalabprogramms;

class Aa
{
	void display()
	{
		System.out.println("This is A");
	}
}

class B extends Aa
{
	void display()
	{
		System.out.println("This is B");
	}
}

class C extends Aa
{
	void display()
	{
		System.out.println("This is C");
	}
}

public class DynamicMethodDispatchDemo {

	public static void main(String[] args) {
	    
		Aa o1=new Aa();
		Aa o2=new B();
		Aa o3=new C();
		
		o1.display();
		o2.display();
		o3.display();
	}

}
