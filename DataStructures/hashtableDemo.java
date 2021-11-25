package DataStructures;
import java.util.*; 
public class hashtableDemo {   
 public static void main(String args[])
 {  
  Hashtable<Integer,String> hm=new Hashtable<Integer,String>(); 
  System.out.println("Before any insertion, size of hash table : " +hm.size()); 
  hm.put(1,"html");  
  hm.put(2,"css");  
  hm.put(3,"javascript");  
  hm.put(4,"type script"); 
  hm.put(5,"angular"); 
  System.out.println("Is hash table empty after insertion ? " + hm.isEmpty());
  System.out.println("Initial hash table is  : ");
  for(Map.Entry m : hm.entrySet())
  {  
   System.out.println(m.getKey() + " " + m.getValue());  
  } 
  //remove a key
  hm.remove(1);
  System.out.println("After removeing key 1  : " + hm);
  //getOrDefault
   System.out.println("value of key with 101  : " + hm.getOrDefault(1, "Not Found"));  
   System.out.println("value of key with 105 : " + hm.getOrDefault(3, "Not Found")); 
  //putIfAbsent
  //Inserts, as the specified pair is unique  
  hm.putIfAbsent(3,"angular");  
  System.out.println("Updated Map: "+ hm);  
  //Returns the current value, as the specified pair already exist  
  hm.putIfAbsent(1,"html");  
  System.out.println("Updated Map: "+ hm);  
 
 }  
}

