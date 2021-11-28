package shivaya;

public class threaddemo extends Thread{

	public void run()
	{
		int i =0;
		while(i<5)
		{
			i++;
			System.out.println("hello");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		threaddemo t=new threaddemo();
		t.start();
		
		/*try {
			t.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}*/
		
		int i=0;
		while(i<5)
		{
			System.out.println("world");
			i++;
			try {Thread.sleep(1000);}catch(Exception e) {}
		}

	}

}
