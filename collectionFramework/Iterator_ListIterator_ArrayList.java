package collectionFramework;

import java.util.*;

class Iterator_ListIterator_ArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(20);
		al.add(13.5f);
		al.add(25.6);
		al.add('G');
		al.add("Goutam dam");
		System.out.println(al); // Printing Data normally

		for (int i = 0; i < al.size(); i++)
			// index Based accessing is allowed for those collection
			// which accepts index based accesing
			System.out.println(al.get(i));
		System.out.println("---------------------------------------");

		for (Object o : al)
			System.out.println(o);
		System.out.println("---------------------------------------");

		Iterator itr = al.iterator();
		// iterator() method acts as a cursor starts before the first position
		// of any collection
		System.out.println(al);
		itr.next();
		itr.remove(); // remove the last element returned by next() method
		System.out.println("After remove() method called : " + al);
		while (itr.hasNext()) { // hasNext() methods returns true if the next
			// element of cursor exits.
			Object o = itr.next(); // next() method iterate the next element
			// of cursor and return that object
			System.out.println(o);
		}

		System.out.println("---------------------------------------");

		ListIterator litrfwd = al.listIterator();
		// ListIterator(extends Iterator inteface) is applicable for only
		// ArrayList and LinkedList
		// listIterator() method acts as a cursor starts starts before the first
		// position
		// of any collection
		System.out.println(al);
		litrfwd.add(100); // adding 100 at the begining of the list, moves the cursor forward
		System.out.println("After add(100) method called : " + al);
		litrfwd.previous(); // taking the cursor backward, starting position of the list
		while (litrfwd.hasNext()) { // hasPrevious() methods returns true if the
			// previous element exists.
			System.out.print("Index : " + litrfwd.nextIndex() + " = ");
			Object o = litrfwd.next(); // Previous() method iterate the Previous
			// element of cursor and return that object
			System.out.println(o);
		}

		System.out.println("---------------------------------------");

		ListIterator litrbwd = al.listIterator(al.size());
		// ListIterator(extends Iterator inteface) is applicable for only
		// ArrayList and LinkedList
		// listIterator() method acts as a cursor starts after the last position
		// of any collection
		System.out.println(al);
		while (litrbwd.hasPrevious()) { // hasPrevious() methods returns true if the
			// previous element exists.
			System.out.print("Index : " + litrbwd.previousIndex() + " = ");
			Object o = litrbwd.previous(); // Previous() method iterate the Previous
			// element of cursor and return that object
			System.out.println(o);
			litrbwd.remove();
			System.out.println(al);
		}
		System.out.println("After Removing all the elements : " + al);
		litrbwd.add(20);
		System.out.println("After add(20) : " + al);
		litrbwd.previous();
		litrbwd.set(25);
		System.out.println("After set(25) : " + al);
	}
}