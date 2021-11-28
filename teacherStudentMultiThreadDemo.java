package abdulbairidemos;

class whiteBoard
{
	String s;
	int nos=0,c=0;
	synchronized void attendance()
	{
		nos++;
	}
	synchronized void write(String s)
	{
		while(c!=0)
		{
			try {wait();}catch(Exception e) {}
		}
		this.s=s;
		c=nos;
		notifyAll();
	}
	
	synchronized String read()
	{
		String str;
		while(c==0)
		{
			try {wait();}catch(Exception e) {}
		}
		str=this.s;
		c--;
		if(c==0)
		{
			notify();
		}
		return str;
	}
}

class teacher extends Thread
{
	whiteBoard obj;
	teacher(whiteBoard obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		String s[]= {"om namah shivaya","someone pls save me :(",
				"i want to wfh shivaya:(","end"};
		for(int i=0;i<s.length;i++)
		{
			obj.write(s[i]);
		}
	}
	
}
class student extends Thread
{
	whiteBoard obj;
	String name;
	student(whiteBoard obj,String name)
	{
		this.obj=obj;
		this.name=name;
		obj.attendance();
	}
	public void run()
	{
		String x;
		do
		{
		    x=obj.read();
			System.out.println(name+" reading  "+x);
		}
		while(x!="end");
	}
}

public class teacherStudentMultiThreadDemo {

	public static void main(String[] args) {
		whiteBoard obj=new whiteBoard();
		teacher t=new teacher(obj);
		student s=new student(obj, "ShankariUMA");
		student s1=new student(obj, "Shivaya");
		t.start();
		s.start();
		s1.start();
	}

}
