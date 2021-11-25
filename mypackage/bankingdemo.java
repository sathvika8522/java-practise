package mypackage;
import java.util.*;
public class bankingdemo {
    public static void main(String[] args) {
        bakingdemodetails obj =new bakingdemodetails(1,1000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the option \n 1:withdraw \n 2:deposit \n 3:display");
        int op=sc.nextInt();
        do
        {
        switch(op)
        {
            case-1:
            {
                obj.withdraw();
                break;
            }
            case-2:
            {
                obj.deposit();
                break;
            }
            case-3:
            {
                obj.display();
                break;
            }
        }
        System.out.println("want to do other transaction y/n?");
        int c = sc.nextInt();
      }
      while(c);
    }
}
