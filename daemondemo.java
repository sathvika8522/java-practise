package abdulbairidemos;

class myThread extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println(Thread.currentThread()+"Thread is running");	
		}
	}
}

public class daemondemo {

	public static void main(String[] args) {
		myThread obj=new myThread();
		obj.setDaemon(true);
		obj.start();
		
		System.out.println("Main thread is sleeping for 10s");
		try 
		{
			Thread.sleep(1);
		}
		catch(InterruptedException e) {}
		
		System.out.println("Main thread exiting");
	}

}
