package mypackage;

public class bakingdemodetails 
{
    private int pin;
    private int balance;
    bakingdemodetails(int pin,int balance)
    {
        this.pin=pin;
        this.balance=balance;
    }
    public void withdraw()
    {
        System.out.println("Enter the amount to withdraw ");
        int amount = sc.nextInt();
        System.out.println("Enter the pin");
        int userpin = sc.nextInt();
        if(userpin==pin && balance>=amount)
        {
            balance-=amount;
            System.out.println("your amount is successfully withdrawn");
        }
        else
        {
            System.out.println("please check your pin or banking credetials");
        }
    }
    public void deposit()
    {
        System.out.println("deposit");
    }
    public void display()
    {
        System.out.println("display");
    }
    
}
