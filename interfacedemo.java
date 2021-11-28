package shivaya;

//interface consists only abstract methods and static
interface samp
{
	//final String = "this is final string in samp";
	final int i=10;
    abstract public void sampMethod();
    //or public void sampMethod();
    //or public void sampMethod(){};
    //or void sampMethod();
}
interface samp2
{
	static int j=12;
	void sampMethod2();
}
class demo implements samp,samp2
{
	static int a=120;
	final int b=100;
	public void sampMethod()
	{
		System.out.println("this is method in samp interface  "+i);
	}
    public void sampMethod2() {
		
		System.out.println("this is method in samp2 interface  "+j);
	}
	
}

class temp
{
	static int c=1200;
	final int d=1000;
}

public class interfacedemo {
	public static void main(String[] args) {
		demo obj =new demo();
		obj.sampMethod();
		obj.sampMethod2();
		System.out.println("======In main block=====");
		System.out.println("static in samp2  "+samp2.j+" "+obj.j+" "+obj.a);
		System.out.println("final in samp  "+samp.i+" "+obj.i+" "+obj.b);
		System.out.println("In temp class");
		temp obj2=new temp();
		System.out.println("static "+temp.c+" "+obj2.c);
		System.out.println("final "+obj2.d);
	}
}
