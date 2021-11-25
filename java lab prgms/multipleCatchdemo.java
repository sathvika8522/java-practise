public class multipleCatchdemo
{
    public static void main(String[] args) {
        try
        {
             int a[]=new int[5];
             int z=1/0;
             a[6]=20;
             System.out.println(z);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero error");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("chack the index of array");
        }
    }
    
}
