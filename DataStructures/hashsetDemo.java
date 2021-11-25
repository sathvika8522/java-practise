package DataStructures;
import java.util.HashSet;
import java.util.*;

public class hashsetDemo {
   public static void main(String[] args) {
       HashSet<Integer> h = new HashSet<Integer>();
       HashSet<Integer> h1 = new HashSet<Integer>();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of hash set");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           System.out.println("Enter any number");
           int x=sc.nextInt();
           h.add(x);
       }
       System.out.println("Befor removing");
       System.out.println(h);
       System.out.println("to remove 1st any element");
       h.remove(1);
       System.out.println(h);
       System.out.println("Iterating through an array");
       Iterator<Integer> I = h.iterator();
       while(I.hasNext())
       {
           int ans=I.next();
           System.out.println(ans);
       }
       h1.addAll(h);
       System.out.println(h1);
   }
}
