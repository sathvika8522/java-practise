package javalabprogramms;

abstract class outer3
{
	abstract public void display();
}
interface outer4
{
	void display1();
}
class anony
{
	outer3 o=new outer3()
			{
	             public void display()
	             {
	            	 System.out.println("anoanymous");
	             }
			};
			
	outer3 o1=new outer3()
			{
		        public void display()
		        {
		        	System.out.println("interface anony");
		        }
			};
	void samp()
	{
		o.display();
		o1.display();
	}
}


public class anonymousInnerClassDemo {

	public static void main(String[] args) {
		anony obj = new anony();
		obj.samp();
	}

}
