package abdulbairidemos;

import java.io.*;

public class filesDemo {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fos=new FileOutputStream("umashakti.txt");
		FileInputStream fis=new FileInputStream("umashakti.txt");
		
		String str="om namah shivaya";
		
		byte b[]=str.getBytes();
		for(byte x:b)
		{
			fos.write(x);
		}
		
        /*another way*/
		//fos.write(str.getBytes());
		
		int x;
		while((x=fis.read())!=-1)
		{
			System.out.print((char)x);
		}
		
		/*------------------------copying one file to other---------------*/
		
		int y;
		FileOutputStream fos1=new FileOutputStream("samp.txt");
		while((y=fis.read())!=-1)
		{
			fos1.write(y);
		}
		
		FileInputStream fis1= new FileInputStream("samp.txt");
		while((y=fis1.read())!=-1)
		{
			System.out.println((char)y);
		}
		
		fos.close();

	}

}
