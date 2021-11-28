
package shivaya;
public class stringsdemo {
	public static void main(String[] args) {
		String s="java";
		char ch[]={'s','t','r','i','n','g','s',};
        String s1=new String(ch);
        String s2=new String("how are you");
        System.out.println(s+" "+s1+"\n"+s2);
        
        //java strings are immutable
        s2.concat("i am fine");
        System.out.println(s2);
        s2=s2.concat("i am fine");
        System.out.println(s2);
	}

}
