package javalabprogramms;

import java.util.*;
class InsufficientFundException extends Exception
{
	public String toString()
	{
		return "Insufficuent fund exception";
	}
}

class Bank
{
	String name;
	int an,bal,amo;
	Scanner sc=new Scanner(System.in);
	void openAccount(String name,int an,int bal)
	{
		this.name=name;
		this.an=an;
		this.bal=bal;
		System.out.println(name+"  "+an+"  "+bal);
	}
	void deposit()
	{
       System.out.println("Enter amount to deposit ");
       amo=sc.nextInt();
       bal=bal+amo;
	}
	void withdraw() throws InsufficientFundException
	{
		System.out.println("Enter amount to withdraw ");
	    amo=sc.nextInt();
	    if(bal<amo)
	    {
	    	throw new InsufficientFundException();
	    }
	    else
	    {
	    	bal=bal-amo;
	    }
	}
}
public class userDefinedException {

	public static void main(String[] args) {
		Bank obj=new Bank();
		Scanner sc=new Scanner(System.in);
		obj.openAccount("shankariUMA", 1, 100);
		int n;
		do
		{
			System.out.println("enter option  ");
			n=sc.nextInt();
			switch(n)
			{
			  case 1:
				            try {
					               obj.withdraw();
				                } 
				           catch (InsufficientFundException e) {
		                            System.out.println(e);
				                }
			  case 2:
				  obj.deposit();
			  case 3:
			  
				  System.out.println("Invalid");
				  break;
			}
		}while(n!=3);
	}

}
