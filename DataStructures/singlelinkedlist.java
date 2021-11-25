package DataStructures;

import java.util.*;
/*------------------------------------listnode class-------------------------------*/
class listNode
{
    int data;
    listNode next;
    listNode(int data)
    {
        this.data=data;
        this.next=null;
    }
}
/*------------------------------------listoperation class-------------------------------*/
class listoperations
{
    //defining some node
    public listNode head;
    public listNode tail;
    
    //creating nodes
    public void creation(int data)
    {
        listNode obj = new listNode(data);
        if(head==null)
        {
            this.head=obj;
        }
        else
        {
             this.tail.next=obj;
        }
        this.tail=obj;
    }
     
    //displaying list data
    public void display()
    {
        listNode test = head;
        while(test!=null)
        {
            System.out.println(test.data);
            test=test.next;
        }
    }


}
/*------------------------------------Main class-------------------------------*/
public class singlelinkedlist {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int ope;
       listoperations list =new listoperations();
       do
       {
           System.out.println("Enter the operation to perform");
           ope=sc.nextInt();
           switch(ope)
           {
              case 1:
              {
                  int data;
                  System.out.println("Enter the data");
                  data = sc.nextInt();
                  list.creation(data);
                  break;
              }
              case 2:
              {
                   list.display();
                   break;
              }
              case 3:
              {
                   System.out.println("not valid");
              }

           }
       }while(ope!=3);
    sc.close();
    }

    
}
