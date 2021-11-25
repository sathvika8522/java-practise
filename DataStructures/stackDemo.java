package DataStructures;
import java.util.*;

public class stackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        Iterator<Integer> I = s.iterator();
        for(int i=0;i<s.size();i++)
        {
            System.out.println(s.get(i));
        }
    
    }
}
