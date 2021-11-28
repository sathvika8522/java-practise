package javalabprogramms;

import java.io.*;
public class bufferReadertoCountLinesWords {

	public static void main(String[] args) throws IOException {
		int noc1=0,now1=0,nol1=0;
		String cl;
		try
		{
			FileReader fis4=new FileReader("umashakti.txt");
			BufferedReader b=new BufferedReader(fis4);
			
			cl=b.readLine();
			while(cl!=null)
			{
				String w[]=cl.split(" ");
				now1=now1+w.length;
				
				for(String w1:w)
				{
					noc1=noc1+w1.length();
				}
				
				nol1++;
				
				cl=b.readLine();
			}
			
            System.out.println("Number Of Chars In A File : "+noc1);     
            System.out.println("Number Of Words In A File : "+now1); 
            System.out.println("Number Of Lines In A File : "+nol1);

						
		}catch(IOException e) {}
		

		
		
	}

}
