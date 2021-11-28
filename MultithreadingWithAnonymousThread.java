package javalabprogramms;

public class MultithreadingWithAnonymousThread {

	public static void main(String[] args) {
		new Thread()
		{
			public void run()
			{ int i1=0;
				while(i1<5)
				{
					System.out.println("Thread 1");
					try {Thread.sleep(500);}catch(Exception e) {};
					i1++;
				}
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				int i2=0;
				while(i2<5)
				{
					System.out.println("Thread 2");
					try {Thread.sleep(500);}catch(Exception e) {};
					i2++;
				}
			}
		}.start();

	}

}
