package firstsession;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateElementsUsingList {
	public static void main(String [] args) {
		ArrayList<String> list = new ArrayList<String>();
        list.add("Sagio Mane");
        list.add("Karius");
        list.add("Mo Salah");
        list.add("Firmino");
        list.add("Lovren");
        list.add("Steven Gerrard");
        list.add("Karius");
        list.add("Mo Salah");

        Set<String> s = new HashSet<String>();

        for(String name : list) {
            if(s.add(name) == false)
                System.out.println(name + "is duplicated");
        }
        
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("vijay");
        list1.add("shamala");
        list1.add("vijay");
        
        for(String name : list1) {
        	if(s.add(name)==false) {
        		System.out.println(name + " is duplicate");
        	}
        }
        
        Iterator<String> itr = list1.iterator();
        
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}
}
