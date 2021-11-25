package DataStructures;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<=5;i++)
        {
            a.add(i+1);
        }
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        a.set(1,100);
        System.out.println(a);
        for(Integer i:a)
        {
            System.out.println(i);
        }
        for (int i = 0; i < a.size(); i++) {
  
            System.out.print(a.get(i) + " ");
        }
    }
}
