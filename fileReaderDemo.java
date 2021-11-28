package abdulbairidemos;

import java.io.*;

public class fileReaderDemo {

	public static void main(String[] args) throws Exception {
	
         FileReader fr=new FileReader("umashakti.txt");
         FileWriter fw=new FileWriter("demoText.txt");
         int x;
         
         String s="har har mahadev";
         for(int i=0;i<s.length();i++)
         {
        	 fw.write(s.charAt(i));
         }
         
         while((x=fr.read())!=-1)
         {
        	 fw.write(x);
         }
         fw.flush();
         
         FileReader fr2=new FileReader("demoText.txt");
         while((x=fr2.read())!=-1)
         {
        	 System.out.print((char)x);
         }
         
 }

}
