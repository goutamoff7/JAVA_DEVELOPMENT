import java.util.*;

class Collection_TreeSetInt {
	public static void main(String[] args) {
		TreeSet ts1 = new TreeSet();
		ts1.add(100); // adding int in ts1
		ts1.add(50); // adding int in ts1
		ts1.add(150); // adding int in ts1
		ts1.add(25); // adding int in ts1
		ts1.add(75); // adding int in ts1
		ts1.add(125); // adding int in ts1
		ts1.add(175); // adding int in ts1

		// ts1.add(100.5); // adding double in ts1, cause runtime exception.
		// we can add int,float,double,char,String value in the TreeSet
		// homogenously,but hetergenous or mixed up data is not allowed
		// The first insertion type must be considered as the type of TreeSet.

		System.out.println(ts1);
		// TreeSet in java follow Binary Search Tree in DSA,
		// parent value is greater than left child value and less than right child value
		// elements are shown as In-Order-Traversal (Left-Value-Right) while print.
		TreeSet ts2 = new TreeSet();
		ts2.addAll(ts1); // add all the elements of ts1 in ts2
		// ts2.add(2, 20); // index based addition not allowed
		ts2.add(150);// Duplicate value if entered will not be included in TreeSet.
		System.out.println(ts2);
		System.out.println(ts2.contains(100));// searching the value in the TreeSet
		System.out.println(ts2.contains(200));// if contains then return true else return false

		System.out.println("higher of 50 : " + ts2.higher(50));
		System.out.println("lower of 50 : " + ts2.lower(50));

		System.out.println("ceiling of 50 : " + ts2.ceiling(50));
		System.out.println("floor of 50 : " + ts2.floor(50));

		System.out.println("higher of 40 : " + ts2.higher(40));
		System.out.println("lower of 40 : " + ts2.lower(40));

		System.out.println("ceiling of 40 : " + ts2.ceiling(40));
		System.out.println("floor of 40 : " + ts2.floor(40));

		System.out.println("In-Order-Traversal First value : " + ts2.first()); // In-Order-Traversal First value
		System.out.println("In-Order-Traversal Last value : " + ts2.last()); // In-Order-Traversal Last value

		System.out.println(ts1);
		ts1.remove(150);
		System.out.println(ts1);

		System.out.println(ts1.descendingSet()); // descending order not reflected to original TreeSet
		System.out.println(ts1);
		System.out.println(ts2);

		System.out.println("Size of the TreeSet 2 : " + ts2.size());
		ts2.remove(25); // remove 25 of ts2 only
		// ts2.remove(); //this method not exit in TreeSet
		System.out.println(ts1);
		System.out.println(ts2);
		ts2.removeAll(ts1); // remove all the ts1 elements from ts2.
		System.out.println(ts2);
		ts2.clear(); // delete all element of ts2
		System.out.println(ts1);
		System.out.println(ts2);
	}
}