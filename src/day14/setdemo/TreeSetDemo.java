package day14.setdemo;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<String> treesetexample = new TreeSet<String>();
		
		treesetexample.add("Ravi");
		treesetexample.add("Vijay");
		treesetexample.add("Ravi");
		treesetexample.add("Ajay");
		treesetexample.add("One");
		treesetexample.add("Two");
		treesetexample.add("Three");
		treesetexample.add("Four");
		treesetexample.add("Five");
		treesetexample.add("six");
		treesetexample.add("seven");
		treesetexample.add("eight");
		treesetexample.add("nine");
		treesetexample.add("ten");
		treesetexample.add("Vijay");
		treesetexample.add("Ravi");
		treesetexample.add("nine111");
		treesetexample.add("ten2222");
		treesetexample.add("Vijay3333");
		treesetexample.add("Ravi444");
		
		try {
			treesetexample.add(null);
		} catch (NullPointerException e) {
			System.out.println("Null pointer execption was found and handles.....");
		}
		
		System.out.println(treesetexample.size());
		System.out.println(treesetexample);
		

		// Traversing elements
//		Iterator<String> itr = treesetexample.iterator();
//		
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
		System.out.println("....................");
		treesetexample.remove("Vijay");
		System.out.println(treesetexample.size());
		System.out.println(treesetexample);
//		
//		itr = treesetexample.iterator();
//		
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
	}

}
