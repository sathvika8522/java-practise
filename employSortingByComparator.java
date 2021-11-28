package javalabprogramms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//---------------------using comparable-------------
class employe implements Comparable<employe>
{
	int sal;
	employe(int sal)
	{
		this.sal=sal;
	}
	public int compareTo(employe e)
	{
		if(this.sal>e.sal)
			return 1;
		if(this.sal<e.sal)
			return -1;
		else
			return 0;
	}
	
	public String toString()
	{
		return "salary : "+this.sal+"\n";
	}
}

//-----------------using comparator-------------
class emp implements Comparator<emp>
{
	String name;
	int salary;
	
	public emp(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public emp() {
		
	}

	public int compare(emp e1,emp e2)
	{
		if(e1.salary<e2.salary)
			return -1;
		if(e1.salary>e2.salary)
			return 1;
		else
			return 0;
	}
	
	public String toString()
	{
		return "Name : "+this.name+", salary : "+this.salary+"\n";
	}
	
}

//--------------------main----------------------
public class employSortingByComparator {

	public static void main(String[] args) {
	   ArrayList<emp> a=new ArrayList<>();
	   
	   a.add(new emp("ShankariUMA",500000));
	   a.add(new emp("Hana",200));
	   a.add(new emp("jk",30000));
	   
	   Collections.sort(a,new emp());
	   
	  /* for(emp eobj:a)
	   {
		   System.out.println(eobj.name+"  "eobj.salary);
	   }*/
	   
	   System.out.println(a);
	   
	   
       ArrayList<employe> a1=new ArrayList<>();
	   
	   a1.add(new employe(500000));
	   a1.add(new employe(200));
	   a1.add(new employe(30000));
	   
	   Collections.sort(a1);
	   
	   System.out.println(a1);
	   

	}

}
