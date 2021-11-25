class exceptiondemo
{
    public int x,y;
    exceptiondemo(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void divisio()
    {
        int z=x/y;
        System.out.println(z);
    }
}

public class trycatchdemo
{
 public static void main(String[] args) {
     exceptiondemo obj = new exceptiondemo(1,0);
     try
     {
         obj.divisio();
     }
     catch(Exception e)
     {
         System.out.println("Division by zero error");
     }
     finally
     {
         System.out.println("programm has terminated");
     }
 }   
}
