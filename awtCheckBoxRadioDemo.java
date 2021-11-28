package javaUI;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.*;
import java.util.*;

class myFrame extends Frame implements ItemListener
{
    Checkbox c1,c2,c3,c4;
    CheckboxGroup cbg;
    Label l;
    
    myFrame()
    {
    	c1=new Checkbox("kashi");
    	c2=new Checkbox("varanashi");
    	
    	c3=new Checkbox("haridwar",false,cbg);
    	c4=new Checkbox("trayambakesh",false,cbg);
    
    	c1.addItemListener(this);
    	c2.addItemListener(this);
    	
    	c2.addItemListener(this);
    	c4.addItemListener(this);
    	
    	l=new Label("none is selected");
    	
    	setLayout(new FlowLayout());
    	add(c1);
    	add(c2);
    	add(c3);
    	add(c4);
    	add(l);
    
    }
    public void itemStateChanged(ItemEvent e)
	{
		if(c1.getState())
			l.setText(c1.getLabel());
		else
			l.setText(c2.getLabel());
	}
}
public class awtCheckBoxRadioDemo {

	public static void main(String[] args) {
		myFrame f1=new myFrame();
		f1.setSize(500,500);
		f1.setVisible(true);

	}

}
