package DataStructures;
import java.util.*;
public class stringToken
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreElements())
        {
            System.out.println(st.nextElement());
        } 
    }
    
}
