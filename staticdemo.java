package shivaya;
class staticdemons
{
	static String s1= "in staticdemons static string";
	String s2 = "normal string";
	static void change()
	{
		s1=s1+" so what!";
	}
	void display()
	{
		System.out.println(s1);
		System.out.println(s2);
	}
}
public class staticdemo {
    static String s = "hi"; 
    int i = 1;
	public static void main(String[] args) {
		staticdemo obj1 = new staticdemo();
		staticdemons obj2 = new staticdemons();
		
		//in the main block
		System.err.println("In the main block:-");
		System.out.println(staticdemo.s);
		System.out.println(obj1.i);
		System.out.println(obj2.s2);
		System.out.println(staticdemons.s1);
		//in another class
		System.out.println("In the another block:--------------");
		obj2.display();
		staticdemons.change();
		obj2.display();

	}

}
