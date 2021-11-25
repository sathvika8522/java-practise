package files;

import java.io.*;

public class writingtofiledemo {
    public static void main(String[] args) throws IOException{
        //writing to a file
        try{
        BufferedWriter obj = new BufferedWriter(new FileWriter("E:\\java programms\\files\\text.txt"));
        obj.write("hello!!! How are you :)\nwelcome to java files Concept");
        obj.close();
        System.out.println("Successfully wrote to file");
        }
        catch(IOException e){
            System.out.println("an error occured");
        }
        //reading froma file
        try
        {
            BufferedReader obj2 = new BufferedReader(new FileReader("E:\\java programms\\files\\text.txt"));
            String s;
            while(obj2.readLine()!=null)
            {
                s=obj2.readLine();
                System.out.println(s);
            }
            obj2.close();
        }
        catch(IOException e)
        {
            System.out.println("Exception ocuured");
        }
    }
    
}
