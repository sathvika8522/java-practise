package javalabprogramms;
import java.util.*;

import javax.swing.JOptionPane;

import java.io.*;
public class showingFilePathsByCreating {

	public static void main(String[] args) {
		 String path="D:\\";
		 Scanner sc=new Scanner(System.in);
		 int f;
		 ArrayList<String> a1=new ArrayList<>();
		 ArrayList<String> a2=new ArrayList<>();
		 
		 do
		 {
			 String fn1=JOptionPane.showInputDialog("enter file name  ");
			 File fi = new File(path+fn1);
			 try
			 {
				 fi.createNewFile();
				 a1.add(fn1);
				 a2.add(fi.getAbsolutePath());
			 }catch(Exception e) {};
			 
			 
			 System.out.println("want to create a file  ");
			 f=sc.nextInt();
			 
		 }while(f==1);
		 
		 for(int i=0;i<a1.size();i++)
		 {
			 System.out.println("Filename  "+a1.get(i)+"  path  "+a2.get(i));
		 }
	}

}
