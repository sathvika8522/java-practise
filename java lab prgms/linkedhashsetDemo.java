import java.util.LinkedHashSet;
import java.util.*;

public class linkedhashsetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of linked hash set");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter any number");
            int x=sc.nextInt();
            h.add(x);
        }
        System.out.println("Befor removing");
        System.out.println(h);
        System.out.println(h);
        System.out.println("Iterating through an linked hash set");
        Iterator<Integer> I = h.iterator();
        while(I.hasNext())
        {
            int ans=I.next();
            System.out.println(ans);
        }
        System.out.println("to remove 1st any element");
        h.remove(1);
    }
    
}
