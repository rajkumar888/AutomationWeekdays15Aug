package collectionsList;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> vect = new Vector<String>();
		System.out.println(vect.size());
		System.out.println(vect.capacity());

		vect.add("Ravi");
		vect.add("Vijay");
		vect.add("Ravi");
		vect.add("Ajay");
		vect.add(null);
		vect.add(null);
		vect.add("Ajay1");
		vect.add("Ajay2");
		vect.add("Ajay3");
		vect.add("Ajay4");
		vect.add("Ajay5");

		System.out.println(vect);

		System.out.println(vect.size());
		System.out.println(vect.capacity());

		Iterator<String> itr = vect.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println("\n.........................");

		Enumeration<String> enumeration = vect.elements();

		while (enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement()+",");
		}

	}

}
