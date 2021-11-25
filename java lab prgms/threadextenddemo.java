import java.lang.*;
class Mythread extends Thread
{  
    public void run()
    {
        for(int i=0;i<5;i++)
        System.out.println("my thread is executed ");
    }
}
class Mythread1 extends Thread
{  
    public void run()
    {
        for(int i=0;i<5;i++)
        System.out.println("my thread1 is executed ");
    }
}

public class threadextenddemo {
    public static void main(String[] args) {
        System.out.println("==========Application started==========");
        Thread obj = new Mythread();
        Thread obj1 = new Mythread1();
        obj.start();
        obj1.start();
        System.out.println("==========Application end==========");
    }
    
}
