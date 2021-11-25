package DataStructures;
import java.util.LinkedList;
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> a = LinkedList<String>();
        System.out.println("Enter the size");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            String x=sc.nextLine();
            a.add(x);
        }
        System.out.println(a);

    }
}
