package com.linklistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsCopyExample1 {
	public static void main(String[] args) {
		// Create lists for source and destination
		
		
		List<String> srclist = new ArrayList<String>(5);
		List<String> destlist = new ArrayList<String>(10);
		
		
		// Populate two source and destination lists
		srclist.add("Java Tutorial");
		srclist.add("is best on");
		srclist.add("JavaTpoint");
		
		destlist.add("JavaTpoint");
		destlist.add("is older than");
		destlist.add("SSSIT");
		
		
		// copy into destination list
		Collections.copy(destlist, srclist);
		
		
		System.out.println("Elements of source list: " + srclist);
		System.out.println("Elements of destination list: " + destlist);
	}
}