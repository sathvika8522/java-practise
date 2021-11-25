package files;
import java.io.*;
import java.io.IOException;

public class readingfile {
    public static void main(String[] args) {
        try {
            BufferedReader obj = new BufferedReader(new FileReader("E:\\java programms\\files\\text.txt"));
            int i;
            /*while((i=obj.read())!=-1)
            {
                System.out.println((char)i);
            }*/
            String s;
            while((s=obj.readLine())!=null)
            {
                System.out.println(s);
            }
            obj.close();
        } catch (IOException e) {
            System.out.println("errrrrrrrr ocurreddddddddddddddd");
        }
    }
    
}
