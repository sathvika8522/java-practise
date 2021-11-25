import java.util.*;
class TooOldexception extends RuntimeException
{
    TooOldexception(String s)
    {
        System.out.println(s);
    }
}
class TooYoungexception extends RuntimeException
{
    TooYoungexception(String s)
    {
        System.out.println(s);
    }
}
public class cretedexception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>60)
        {            
            throw new TooOldexception("tooooooooo old");
        }
        else
        {
            throw new TooYoungexception("tooooooooo young");
        }
        
    }
    
}
