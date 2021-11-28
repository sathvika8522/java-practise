package javalabprogramms;

class counter extends Thread
{
	int c=0;
	synchronized void inc()
	{
		c++;
	}
}
public class anonymousThreadsDemo {

	public static void main(String[] args) throws InterruptedException {
	        counter obj=new counter();
	        Thread t1=new Thread()
	        {
	        	public void run()
	        	{
	        		int r=0;
	        		while(r<100)
	        		{
	        			r++;
	        			obj.inc();
	        		}
	        	}
	        };
	        t1.start();
	        
	        Thread t2=new Thread()
	        {
	        	public void run()
	        	{
	        		int s=0;
	        		while(s<100)
	        		{
	        		   s++;
	        		   obj.inc();
	        		}
	        	}
	        };
	        t2.start();
	        
	        t1.join();
	        t2.join();
	       
	        System.out.println("count "+obj.c);
	        
	}

}
