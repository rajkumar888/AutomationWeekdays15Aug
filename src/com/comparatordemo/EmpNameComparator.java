package com.comparatordemo;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}