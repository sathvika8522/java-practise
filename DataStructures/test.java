package javalabprogramms;
import java.util.*;
import java.lang.*;
public class commandlineargsDemo {
	
	public static void main(String[] args) throws Exception{
		int n;
		int b=1;
		
		System.out.println("enter n");
		n=Integer.parseInt(args[0]);
		
		for(int i=1;i<=n;i++)
		{
			b=b*i;
		}
		
		System.out.println(b);
		
	}

}
