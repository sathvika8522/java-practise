package javalabprogramms;

import javax.swing.JOptionPane;

import java.io.*;

class fileNotFoundException extends Exception
{
	private static final long serialVersionUID = 1L;

	public String toString()
	{
		return "file not found use demo.txt instead";	
	}
}

public class fileNotFoundExceptionDemo {

	public static void main(String[] args) throws fileNotFoundException, IOException{
		
		 String s=JOptionPane.showInputDialog("Enter file: ");
         File f=new File(s);
         
         if(!f.exists())
         {
        try {
        	 throw new fileNotFoundException();
            }
        catch(fileNotFoundException e)
        {
        	System.out.println(e);
        	
        	FileOutputStream f1=new FileOutputStream(s);
        	String s1=JOptionPane.showInputDialog("file is created write something into it");
        	
        	byte b[]=s1.getBytes();
            f1.write(b);
        	
        	int xx;
        	FileReader f3=new FileReader(s);
        	while((xx=f3.read())!=-1)
        	{
        		System.out.print((char)xx);
        	}
        }
         }
		
	}

}
