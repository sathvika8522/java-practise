package javalabprogramms;

class figure
{
	int x,y;
	figure(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void area()
	{
		System.out.println("area method in figure");
	}
}
class triangle extends figure
{
	triangle(int x,int y)
	{
		super(x,y);
	}
	void area()
	{
		System.out.println("triangle area"+ (x*y)/2);
	}
}
class rectangle extends figure
{
	rectangle(int x,int y)
	{
		super(x,y);
	}
	void area()
	{
		System.out.println("rectangle area"+ (x*y)/2);
	}
}

public class runtimepolyDemo {

	public static void main(String[] args) {
	         
		figure f;
		triangle t=new triangle(1,1);
		rectangle r=new rectangle(1,2);
		f=t;
		f.area();
		f=r;
		f.area();
	}

}
