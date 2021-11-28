package abdulbairidemos;
import java.util.*;
class atm
{
	synchronized public void checkBalance(String name)
	{
		System.out.println(name+" is checking balance :) ");
	}
	synchronized public void withdraw(String name,int amou)
	{
		System.out.println(name+" is withdrawing "+amou);
	}
}

class customer extends Thread
{
   atm obj;
   String name;
   int amo;
   customer(atm obj,String name,int amo)
   {
	   this.obj=obj;
	   this.name=name;
	   this.amo=amo;
   }
   public void run()
   {
	   obj.checkBalance(name);
	   obj.withdraw(name, amo);
   }
}

public class ATMusingsynchronizeddemo {
     public static void main(String[] args) {
		atm a=new atm();
		customer t1=new customer(a,"shankariUMA",200);
		customer t2=new customer(a,"hana",500);
	    t1.start();
	    t2.start();
	}
}
