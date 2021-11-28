ackage javalabprogramms;

class bankITC
{
	int bal=0;
	int amo;
	int f=0;
	bankITC()
	{
	 bal=0;
	}
	synchronized void withdraw(int amo)
	{
		this.amo=amo;
		if(bal<amo)
		{
			while(this.bal<this.amo)
			{
				System.out.println("waiting.......");
				try
				{wait();}catch(Exception e) {};
			}	
		}
		else
		{
			bal=bal-amo;
			System.out.println("Money withdrawn");
			notify();
			f=1;	
		}
	}
	synchronized void deposit()
	{
		System.out.println("depositing.....");
		bal=bal+1;
        notify();
	}
}
class p1 extends Thread
{
	bankITC b;
	p1(bankITC b)
	{
		this.b=b;
	}
	public void run()
	{
		while(b.f==0)
		{
			b.withdraw(10);
		}
	}
}

class p2 extends Thread
{
	bankITC b;
	p2(bankITC b)
	{
		this.b=b;
	}
	public void run()
	{
		while(b.f==0)
		{
			b.deposit();
		}
	}
}
public class depositWithdrawUsingITC {

	public static void main(String[] args) {
		
		bankITC obj=new bankITC();
		p1 t1=new p1(obj);
		p2 t2=new p2(obj);
		
		t1.start();
		t2.start();
		
		try
		{
			t1.join();
			t2.join();
		}catch(Exception e) {};

		
		System.out.println("transaction is successfull.........");

	}

}
