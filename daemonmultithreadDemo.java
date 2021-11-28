package javalabprogramms;

class MyThread1 extends Thread
{
	public void run()
	{
		while(true)
		System.out.println("Thread1 is running");
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		while(true)
		System.out.println("Thread2 is running");
	}
}

public class daemonmultithreadDemo {

	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();
		MyThread2 t2=new MyThread2();
		t1.setDaemon(true);
	    t2.setDaemon(true);
	    t1.start();
	    t2.start();
	    
	    try
	    {
	    	Thread.sleep(1);
	    }
	    catch(InterruptedException e)
	    {
	        }
	    
	    System.out.println("Main thread is exiting........");
	}

}
