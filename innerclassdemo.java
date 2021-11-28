package shivaya;

/*nested inner class*/
class outer
{
	class inner
	{
	   inner()
	   {
		   System.out.println("Inside inner class")  ; 
	   }
	}
}
/*method local inner class*/
class outer1
{
	private int i=1;
	void outerMethod()
	{
		int j=2;
		class inner1
		{
			private int samp=4;
			inner1()
			{
				 System.out.println("Inside method inner class  "+i+" "+j+" "+samp); 	 
			}
		}
		inner1 inobj = new inner1();
	}
}
/*static nested class*/
class outer2
{
	private int samp=123;
	int samp2=1234;
	static int p1=1000;
	final int q1=2000;
	static class inner2
	{
		static int p=100;
		final int q=200;
		int r=300;
		void display()
		{
			System.out.println("Inside static inner class  "+p+q+p1);
			//syso(samp+samp2+q1)
		}
	}
	void createInnerObj()
	{
		inner2 in2=new inner2();
		in2.display();
	}
}

/*anonymous inner class*/
class Demo {
	   void show() {
	      System.out.println("i am in show method of super class");
	   }
	}
class Flavor1Demo {
	  
	   //  An anonymous class with Demo as base class
	   static Demo d = new Demo() {
	       void show() {
	           super.show();
	           System.out.println("i am in Flavor1Demo class");
	       }
	   };
	   void disp(){
	       d.show();
	   }
	}
	
public class innerclassdemo {

	public static void main(String[] args) {
       outer.inner inobj=new outer().new inner();
       outer1 obj1 = new outer1();
       obj1.outerMethod();
       outer2 obj2 = new outer2();
       obj2.createInnerObj();
	}

}
