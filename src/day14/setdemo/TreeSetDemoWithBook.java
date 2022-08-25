package day14.setdemo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemoWithBook {

	public static void main(String[] args) {

		// Creating Books
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		Book b4 = new Book(104, "Windows", "Halvin", "Tiley", 9);

		TreeSet<Book> treeSet = new TreeSet<Book>(Comparator.comparing(Book::getId).reversed());
		// Adding Books to HashSet
		treeSet.add(b1);
		treeSet.add(b2);
		treeSet.add(b3);
		treeSet.add(b4);

		// Traversing HashSet
		for (Book b : treeSet) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}