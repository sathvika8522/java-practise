package javalabprogramms;

class demo
{
  void display(String ...a)
	{
		for(String s:a)
		{
			System.out.println(s);
		}
	}

}
public class variableLengthArgDemo {
	
	public static void main(String[] args) {
		
		demo obj=new demo();
		obj.display("shivaya","shankari");
	}

}
