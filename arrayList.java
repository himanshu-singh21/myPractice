package java_Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		
		System.out.println("Beleow array in Non-Generic form");
		
		ArrayList obj1 = new ArrayList();
		
		obj1.add("Himasnhu");
		obj1.add(977917551);
		obj1.add('S');
		obj1.add(30.5);
		
		System.out.println(obj1);
		System.out.println("-");
		
		int s = obj1.size();
		
		for(int i=0;i<s;i++)
		{
			System.out.println("Value of the Array is "+obj1.get(i));
		}
		
		System.out.println("----------------------");
		System.out.println("Beleow array in Generic form");
		
		ArrayList<String> obj2 = new ArrayList<String>();
		
		obj2.add("Himasnhu");
		obj2.add("Ashwani");
		obj2.add("Amritanshu");
		obj2.add("Ashsih");
		obj2.add("Ashsih");
		obj2.add("Ashsih");
		obj2.add("Ashsih");
		obj2.add("Kumar");
		obj2.add("Singh");
		
		for(String abc:obj2)
		{
			System.out.println("Value of the Array is "+abc);
		}
		
		
		System.out.println("----------------------");
		
		obj2.remove(3);
		
		Iterator itr = obj2.iterator();
		
		while (itr.hasNext())
		{
			Object gyt = itr.next();
			System.out.println("Value of Array is "+gyt);
		}
	
		
		
		
		
		
		
		 

	}

}
