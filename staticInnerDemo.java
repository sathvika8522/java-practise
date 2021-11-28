package shivaya;

class outerMy
{
	static int x=10;
	static class inner1
	{
		public void display()
		{
			System.out.println("In static "+x);
		}
	}
}

public class staticInnerDemo {

	public static void main(String[] args) {
	      outerMy.inner1 i= new outerMy.inner1();
	      i.display();
	}

}
