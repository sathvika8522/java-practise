package shivaya;

class A
{
	String defvar="--------default variable---------";
	private String privar="----------private variable--------";
	public String pubvar="---------public variable---------";
	protected String provar="---------protected variable---------";
	void display()
	{
		System.out.println(defvar);
		System.out.println(privar);
		System.out.println(pubvar);
		System.out.println(provar);
	}
}
class B extends A
{
	void display()
	{
		System.out.println(defvar);
		//System.out.println(privar);
		System.out.println(pubvar);
		System.out.println(provar);
	}
}
public class singleInheritance {

	public static void main(String[] args) {
		A obj = new A();
		B obj2 = new B();
		System.out.println("=========In A class========");
		obj.display();
		System.out.println("=========In B class========");
		obj2.display();
		System.out.println("=========In main block======");
		System.out.println(obj.defvar);
		//System.out.println(obj.privar);
		System.out.println(obj.pubvar);
		System.out.println(obj.provar);
		System.out.println(obj2.defvar);
		//System.out.println(obj.privar);
		System.out.println(obj2.pubvar);
		System.out.println(obj2.provar);

	}

}
