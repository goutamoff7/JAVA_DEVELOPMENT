import java.util.*;

// HashMap can be used in Multi threading Environment.
class Collection_HashMap {
	public static void main(String[] args) {
		HashMap hm1 = new HashMap();
		hm1.put(null, null); // key=null, value=null is allowed in HashMap
		hm1.put(1, 100); // puting integer as value in hm1
		hm1.put(2, 20); // puting integer as value in hm1
		// hm1.put(3, 13.5f); // puting float as value in hm1
		hm1.put(4, 25.6); // puting double as value in hm1
		hm1.put(5, 'G'); // puting character as value in hm1
		hm1.put(6, "Goutam Dam"); // puting String as value in hm1

		hm1.put(100, 1); // puting integer as key in hm1
		hm1.put(20, 2); // puting integer as key in hm1
		hm1.put(13.5f, 3); // puting float as key in hm1
		hm1.put(25.6, 4); // puting double as key in hm1
		hm1.put('G', 5); // puting character as key in hm1
		hm1.put("Goutam Dam", 6); // puting string as key in hm1

		System.out.println(hm1); // Order of Insertion not preserved

		HashMap hm2 = new HashMap();
		hm2.putAll(hm1); // put hml the elements of hm1 in hm2
		hm2.put(2, 8); // duplicate key does not enter into the hashMap
		hm2.put(7, 8); // but duplicate value can be allowed.
		System.out.println(hm2);
		System.out.println(hm1.get(6)); // getting value of key 6 of hm1
		System.out.println(hm2.get("Goutam Dam")); // getting value of key "Goutam Dam" of hm2

		System.out.println(hm2.containsValue(100)); // searching the value in the HashMap,
		System.out.println(hm2.containsValue(200));// if contains then return true else false

		System.out.println(hm2.containsKey(2)); // searching the key in the HashMap,
		System.out.println(hm2.containsKey(8));// if contains then return true else false

		System.out.println("Size of the HashTable 2 : " + hm2.size());
		hm2.remove(2); // remove the value key 2 only.
		hm1.remove('G', 5); // remove the key value pair.
		// hm2.remove(); //this method not exit in HashMap
		hm1.putIfAbsent(3, 13.5f); // if key, value is not present then included
		System.out.println(hm1);
		System.out.println(hm2);
		hm2.clear(); // delete all element of hm2
		System.out.println(hm1);
		System.out.println(hm2);
	}
}