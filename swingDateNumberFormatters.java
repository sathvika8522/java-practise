package javaUI;

import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.*;
import javax.swing.text.NumberFormatter;

class mf extends JFrame
{
	mf()
	{
		JTextField tf1=new JTextField(20);
		
		/*formatted text field for date*/
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		JFormattedTextField tf2=new JFormattedTextField(df);
		tf2.setColumns(15);
		tf2.setValue(new Date());
		
		//number formatter
		NumberFormat nf=NumberFormat.getInstance();
		NumberFormatter nft=new NumberFormatter(nf);
		nft.setAllowsInvalid(true);
		nft.setMaximum(1000);
		
		JFormattedTextField tf3=new JFormattedTextField();
		 
		tf3.setColumns(15);
		 
		
		setLayout(new FlowLayout());
		add(tf1);
		add(tf2);
		add(tf3);
		
	}
}
public class swingDateNumberFormatters {

	public static void main(String[] args) {
		mf f=new mf();
		f.setVisible(true);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
