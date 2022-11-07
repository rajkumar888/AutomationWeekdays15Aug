package collectionsSetMapdemo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemoBookObject {

	public static void main(String[] args) {

		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		Book b4 = new Book(104, "Windows", "Halvin", "Tiley", 9);

		TreeSet<Book> set = new TreeSet<Book>(Comparator.comparing(Book::getName));
//		TreeSet<Book> set = new TreeSet<Book>(Comparator.comparing(Book::getId));
//		TreeSet<Book> set = new TreeSet<Book>(Comparator.comparing(Book::getQuantity).reversed());
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		
//		for(Book localvariable :set){
//			System.out.println(localvariable.getId()+" "+localvariable.getName()+" "+localvariable.getAuthor()+" "+" "+localvariable.getPublisher()+" "+localvariable.getQuantity());
//		}
		
		for(Book xyz :set){
			System.out.println(xyz);
		}

	}

}
