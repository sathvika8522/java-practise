package abdulbairidemos;

class data
{
	int num;
	boolean f=true;
	synchronized void set(int num)
	{
		while(f!=true)
		{
			try {wait();} catch (InterruptedException e) {}
		}
		this.num=num;
		f=false;
		notify();
	}
	
	synchronized int get()
	{
		int x;
		while(f!=false)
		{
			try {wait();} catch (InterruptedException e) {}
		}
		x= this.num;
        f=true;
        notify();
        return x;
	}
}

class producer extends Thread
{
	data d;
	producer(data d)
	{
		this.d=d;
	}
	public void run()
	{
		int c=0;
		while(true)
		{
			d.set(c);
		    System.out.println("producer "+c);
			c++;
		}
		
	}
}

class consumer extends Thread
{
	data d;
	consumer(data d)
	{
		this.d=d;
	}
	public void run()
	{
		int c;
		while(true)
		{
			c=d.get();
		    System.out.println("consumer "+c);
		}
		
	}
}

public class producerConsumer {

	public static void main(String[] args) {
		data d=new data();
		producer p=new producer(d);
		consumer c=new consumer(d);
		p.start();
		c.start();

	}

}
