public class staticblock {
    static
    {
        System.out.println("static block is executed first");
    }
    staticblock()
    {
        System.out.println("constructor is executed next");
    }
    public static void main(String[] args) {
       staticblock obj=new staticblock();       

    }
    
}
