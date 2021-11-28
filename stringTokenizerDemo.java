package javalabprogramms;

import java.util.StringTokenizer;

public class stringTokenizerDemo {

	public static void main(String[] args) {
		
		int now=0,noc=0,nol=0;
		String str="welcome to java \n How are you";
		StringTokenizer s=new StringTokenizer(str);
		int notk=s.countTokens();
		System.out.println("the total words are "+notk);
		
		while(s.hasMoreTokens())
		{
			String x1=s.nextToken();
			noc=noc+x1.length();
		}
		
		System.out.println("Number of characters  "+noc);
		
		StringTokenizer s1=new StringTokenizer(str,"\n");
		nol=s1.countTokens();
		System.out.println("Number of lines  "+nol);
		
		StringTokenizer s2=new StringTokenizer(str,"   ");
		System.out.println("Number of paragraphs  "+s2.countTokens());
		
	}

}
