package com.comparatordemo;

import java.util.Comparator;

public class EmpNoComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		
		
		
		return e1.getEmpno()-e2.getEmpno();
	}
}