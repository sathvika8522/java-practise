class sup
{
   int a;
   sup()
   {
       a=0;
   }
   public void show()
   {
     System.out.println("in sup a "+a);  
   }
}
class sub extends sup
{
   
   int b;
   sub()
   {
       b=0;
   }
   public void show()
   {
     super.show();
     System.out.println("in sub b and a "+a+' '+b);  
   }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        sup obj=new sub();
        obj.show(); //sub class overrides sup class this is dynamic method dispatch
    }
    
}
