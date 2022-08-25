package com.collectionsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArryaListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<String> list = new ArrayList<String>();
//		
//		list.add("pppp");
//		list.add("pppp1");
////
//		List list2 = new ArrayList();
//
//		 list2.add(100);
//		 list2.add("hello");
//		 list2.add(true);

		List<String> list1 = new ArrayList<String>();
		list1.add("Fan");
		list1.add("Table");
		list1.add("Java");
		list1.add("Microsoft");
		list1.add("Apple");
		list1.add("100");
//
		System.out.println(list1);
		System.out.println(list1.size());
//
		for (int i = 0; i < list1.size(); i++) {

			System.out.print(list1.get(i) + " ");
		}
//
		System.out.println();
//
		for (int i = list1.size() - 1; i >= 0; i--) {

			System.out.print(list1.get(i) + " ");
		}
//
		System.out.println();
//
		for (String ls : list1) {

			System.out.print(ls + " ");
		}
		
		System.out.println("\n.......................");
//
//		Iterator<String> iter = list1.iterator();

//		for (; iter.hasNext();) {
//			System.out.print(iter.next()+" ");
//		}
////
//		System.out.println("\n.......................");
////		
//		 ListIterator<String> listiter = list1.listIterator();
//		 
//		for (; listiter.hasNext();) {
//			System.out.print(listiter.next()+" ");
//		}
//		System.out.println("\n.......................");
//		
//		for (; listiter.hasPrevious();) {
//			System.out.print(listiter.previous()+" ");
//		}
		System.out.println("\n.......................");
		
		ListIterator<String> listreverse = list1.listIterator(list1.size());
		
		for (; listreverse.hasPrevious();) {
			System.out.print(listreverse.previous()+" ");
		}
		
		
		List<String>list555 = Arrays.asList("abc", "fdf", "bc", "efg", "abcd","qweq", "jkl");
		
	}

}
