package javaUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JLabel l;
	JButton b;
	int c=0;
	public MyFrame() {
		l=new JLabel("count:"+c);
		b=new JButton("click");
		
		setLayout(new FlowLayout());
		add(l);
		add(b);
		b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		c++;
		l.setText("count:"+c);
	}
}

public class swingdemo {


	public static void main(String[] args) {
		MyFrame f=new MyFrame();
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
