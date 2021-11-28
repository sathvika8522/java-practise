package shivaya;

import java.util.*;

public class comparabledemo {

	public static void main(String[] args) {
		List<laptop> li = new ArrayList<>();
		li.add(new laptop("windows",10));
		li.add(new laptop("Hp",11));
		li.add(new laptop("lenova",2));
		
		for(laptop i:li)
		{
			System.out.println(i);
		}
		
		Collections.sort(li);
		
		for(laptop i:li)
		{
			System.out.println(i);
		}

	}

}
