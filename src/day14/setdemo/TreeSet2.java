package day14.setdemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String args[]) {

		TreeSet<String> treesetexample = new TreeSet<String>();
		
		treesetexample.add("Ravi");
		treesetexample.add("Vijay");
		treesetexample.add("Ajay");
		treesetexample.add("Ravi");
		treesetexample.add("Ajay");
		treesetexample.add("One");
		treesetexample.add("Two");
		treesetexample.add("Three");
		treesetexample.add("Four");
		treesetexample.add("Five");
		treesetexample.add("six");
		treesetexample.add("seven");

		System.out.println(treesetexample);

		System.out.println("Traversing element through Iterator in descending order");

		Iterator<String> i = treesetexample.descendingIterator();

		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
	}
}