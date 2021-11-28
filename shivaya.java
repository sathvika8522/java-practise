package shivaya;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.Timer;

public class shivaya implements ActionListener{
    
	public static shivaya s;
	public final int WIDTH=800,HEIGHT=800;
	public Render renderer;
	public Rectangle bird;
	public int ticks,yMotion;
	public ArrayList<Rectangle> columns;
	public Random rand;
	
	public shivaya()
	{
		JFrame jf=new JFrame();
		Timer timer=new Timer(20,this);
		timer.start();
		
		renderer=new Render();
		rand=new Random();
		columns=new ArrayList<>();
		bird=new Rectangle(WIDTH/2-10,HEIGHT/2-10,20,20);
		
		jf.add(renderer);
		jf.setVisible(true);
		jf.setSize(WIDTH,HEIGHT);
		//jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void addColumn(boolean start)
	{
		int space=300;
		int width=100;
		int height=50+rand.nextInt(300);
		
		if(start)
		{
			columns.add(new Rectangle(WIDTH+width+columns.size()*300,HEIGHT-height-120,width,height));
			columns.add(new Rectangle(WIDTH+width+(columns.size()-1)*300,0,width,HEIGHT-height-space));	
		}
		else
		{
			columns.add(new Rectangle(columns.get(columns.size()-1).x+600,HEIGHT-height-120,width,height));
			columns.add(new Rectangle(columns.get(columns.size()-1).x,0,width,HEIGHT-height-space));	
		}
	}
	
	public void paintColumn(Graphics g,Rectangle column)
	{
		g.setColor(Color.green.darker());
		g.fillRect(column.x, column.y, column.width, column.height);
	}
	
	public void repaint(Graphics g) 
	{
	   g.setColor(Color.cyan);
	   g.fillRect(0, 0, WIDTH, HEIGHT);
	   
	   g.setColor(Color.orange);
	   g.fillRect(0, HEIGHT-120, WIDTH, 120);
	
	   g.setColor(Color.green);
	   g.fillRect(0, HEIGHT-120, WIDTH, 20);
	   
	   g.setColor(Color.red);
	   g.fillRect(bird.x, bird.y, bird.width, bird.height);
	   
	   for(Rectangle col:columns)
	   {
		   paintColumn(g, col);
		   
	   }
    }

	public void actionPerformed(ActionEvent e) {
		
		int speed=10;
		ticks++;
		
		for(int i=0;i<columns.size();i++)
		{
			Rectangle column=columns.get(i);
			column.x-=speed;
		}
		
		if(ticks%2==0 && yMotion<15)
		{
			yMotion+=2;
		}
		bird.y+=yMotion;
		renderer.repaint();
		
	}

	//---------------------------- Main Method -----------------------------
	public static void main(String[] args) {
	      System.out.println("om namah shivaya :)");
          s=new shivaya();
	}
}
