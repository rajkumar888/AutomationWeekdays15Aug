package com.setandmapdemo;

import java.util.Map;
import java.util.TreeMap;

public class GFG {
	public static void main(String[] args) {

		Book b1 = new Book(555, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(222, "Operating System", "Galvin", "Wiley", 6);
		Book b4 = new Book(101, "Windows", "Halvin", "Tiley", 9);

		TreeMap<Integer, Book> tmap = new TreeMap<Integer, Book>();

		// Mapping book objects to int keys
		tmap.put(4, b1);
		tmap.put(2, b2);
		tmap.put(3, b3);
		tmap.put(1, b4);

		for (Map.Entry<Integer, Book> entry : tmap.entrySet()) {
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}
	}
}
