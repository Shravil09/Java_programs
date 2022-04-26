package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ClassA {
	void display() 
	{
		LinkedHashMap map = new LinkedHashMap();
		// HashMap map = new HashMap();
		map.put(101, "Java");
		map.put("Kishan", "Java");
		map.put(102, 1000);
		map.put(null, "Python");
		map.put(104, "CSS");
		map.put("Shravil", "Developer");
		
		System.out.println(map);
		
		HashSet hs = new HashSet(map.keySet());
		System.out.println("Key set present in the HashMap=====>"+ hs);
		
		System.out.println("------------------");
		HashSet hs2 = new HashSet(map.entrySet());
		
		Iterator i = hs2.iterator();
		System.out.println("Using Map.Entry");
		while(i.hasNext()) 
		{
			//System.out.println(i.next());
			
			Entry e = (Entry)i.next();
			System.out.println(e.getKey() + " "+e.getValue());
		}

	}
	public static void main(String[] args) {
		
		new ClassA().display();
	}

}
