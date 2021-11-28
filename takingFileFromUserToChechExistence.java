package javalabprogramms;

import java.io.*;
import javax.swing.*;

public class takingFileFromUserToChechExistence {

	public static void main(String[] args) throws Exception{
		String s=JOptionPane.showInputDialog("Enter file: ");
		
		File f=new File(s);
		
		System.out.println("checking file exists "+f.exists());
		System.out.println("checking file is readble  "+f.canRead()+
				" is writable "+f.canWrite());
		
		FileInputStream fis2=new FileInputStream(s);
		int p;
		while((p=fis2.read())!=-1)
		{
			System.out.print((char)p);
		}
		
		

	}

}
