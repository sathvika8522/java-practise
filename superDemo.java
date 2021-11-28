package shivaya;

class parentClass
{
    String s="parent class variable";
    parentClass()
    {
    	System.out.println("parent class constructor");
    }
    void display()
    {
    	System.out.println("parent class method");
    }
}

class child extends parentClass{

 child() {
		System.out.println("child class constructor");
	}
	
	void show()
	{
		System.out.println(1);
		//super.display();
	}
	
}
class superDemo {
	public static void main(String[] args) {
		child obj=new child();
		obj.show();
	}

}
