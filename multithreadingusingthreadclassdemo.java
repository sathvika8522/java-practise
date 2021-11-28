package shivaya;

class myThread1 extends Thread
{
	public void run()
	{
		int i=0;
		while(i<6)
		{
			System.out.println("hello");	
			i++;
			try {Thread.sleep(500);}catch(Exception e) {
				System.out.println("intrupteddddddddddd");
			}
		}
	}
}

class myThread2 extends Thread
{
	public void run()
	{
		int i=0;
		while(i<6)
		{
			System.out.println("world");	
			i++;
			try {Thread.sleep(500);}catch(Exception e) {
			}
		}
	}
}


public class multithreadingusingthreadclassdemo {

	public static void main(String[] args) {
		myThread1 t1=new myThread1();
		myThread2 t2=new myThread2();
		
		t1.start();
		t2.start();

		t1.yield();

	}

}
