package Map;

import java.util.Hashtable;
import java.util.TreeMap;

public class ClassD {

	void display() {
		Hashtable map = new Hashtable();
		map.put(104, "CSS");
		map.put(101, "Java");
		map.put("Kishan", "Java");
		map.put(102, 1000);
	//	map.put(null, "Python");
		System.out.println(map);
	}

	public static void main(String[] args) {
		new ClassD().display();
	}


	}


