//program to demonstrate the usage of HashMap

package nikitha;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args){
		HashMap<String, Integer> phonebook = new HashMap<>();
		phonebook.put("Amanda", 675477868);
		phonebook.put("Lalu", 786868766);
		phonebook.put("Pali", 342435358);
		phonebook.put("Mani", 655712537);
		
		System.out.println(phonebook);
		System.out.println(phonebook.get("Pali"));
		Set set=phonebook.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
	}
}
