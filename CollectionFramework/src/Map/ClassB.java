package Map;

import java.util.TreeMap;

public class ClassB {
	
	void display() {
		TreeMap map = new TreeMap();
		map.put(104, "CSS");
		map.put(101, "Java");
		//map.put("Kishan", "Java");
		map.put(102, 1000);
		//map.put(null, "Python");
		System.out.println(map);
	}

	public static void main(String[] args) {
		new ClassB().display();
	}

}
