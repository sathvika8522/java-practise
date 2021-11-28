package javaUI;
import java.awt.*;
public class awtdemo{
	public static void main(String[] args) {
		Frame f=new Frame("shankariShivaya");
		f.setLayout(new FlowLayout());
		
		Button b=new Button("ok");
		Label l=new Label("Name");
		TextField t=new TextField(20);
		
		f.add(l);
		f.add(t);
		f.add(b);
		
		f.setSize(400,400);
		f.setVisible(true);

	}

}
