abstract class writer
{
   public abstract void show(); 
   public void show1() {
       
   }
}
class pen extends writer
{
    public void show()
    {
       System.out.println("In pen");
    }
    public void anotherMethod()
    {
        System.out.println("Another method which is not in an abstract class");   
    }
}
class pencil extends writer
{
    public void show()
    {
       System.out.println("In pencil");
    }
    public void anotherMethod()
    {
        System.out.println("Another method which is not in an abstract class");   
    }
}
public class AbstractDemo
{
    public static void main(String[] args)
    {
        writer obj1=new pen();
        writer obj2=new pencil();
        obj1.show();
        obj2.show();
        /* obj1.anotherMethod() ======>> False */
        pen obj=new pen();
        obj.anotherMethod();
        
    }

    
}
