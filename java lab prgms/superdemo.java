class sup
{
   int a;
   sup()
   {
       a=0;
   }
   sup(int a)
   {
       this.a=a;
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
   sub(int b)
   {
       this.b=b;
   }
   sub(int a,int b)
   {
       super(a);
       this.b=b;
   }
   public void show()
   {
     super.show();
     System.out.println("in sub b and a "+a+' '+b);  
   }
}
public class superdemo {
    public static void main(String[] args)
    {
        sub obj = new sub(1,2);
        obj.show();
        
    }
}                                                                                                                                                                                                                                                                 