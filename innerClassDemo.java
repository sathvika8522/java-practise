package javalabprogramms;

class A
{
	class B
	{
		void show()
		{
			System.out.println("This is inner class :)");
		}
	}
	
	void call()
	{
		B obj=new B();
		obj.show();
	}
}

public class innerClassDemo {

	public static void main(String[] args) {
		A obj=new A();
		obj.call();
	}

}
