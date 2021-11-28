package shivaya;

final class A
{
	String s="this is final class";
}
class B
{
	final void finalMethod()
	{
		System.out.println("this is final method");
	}
}

/*class c extends A
{
   gives error
}*/

class D extends B
{
	/*void finalMethod()
	  Can't Override gives error
	 */
}
public class finaldemo {
	public static void main(String[] args) {
		final int samp=5;
		System.out.println("final variable"+samp);
		//gives error ;)
		/*samp=6;
		System.out.println("final variable"+samp);*/

	}

}
