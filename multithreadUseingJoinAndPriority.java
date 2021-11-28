package javalabprogramms;

class mt1 extends Thread
{
     int i=0;
     public void run()
     {
    	 while(i<5)
    	 {
    		 try
    		 {
    			 Thread.sleep(1000);
    		 }catch(InterruptedException e) {};
    		 
    		 System.out.println("Thread 1.....");
    		 i++;
    	 }
     }
}

class mt2 extends Thread
{
     int i=0;
     public void run()
     {
    	 while(i<5)
    	 {
    		 System.out.println("Thread 2.....");
    		 i++;
    	 }
     }
}

class mt3 extends Thread
{
     int i=0;
     public void run()
     {
    	 while(i<5)
    	 {
    		 System.out.println("Thread 3.....");
    		 i++;
    	 }
     }
}

public class multithreadUseingJoinAndPriority {

	public static void main(String[] args) {
	    mt1 t1=new mt1();
	    mt2 t2=new mt2();
	    mt3 t3=new mt3();
	    
	    t1.setPriority(1);
	    t2.setPriority(5);
	    t3.setPriority(10);
	    
	    t1.start();
	 
	   try
	   {
		   t1.join();
	   }catch(Exception e) {};
	    
	   t2.start();
	   t3.start();
	    
	}

}
