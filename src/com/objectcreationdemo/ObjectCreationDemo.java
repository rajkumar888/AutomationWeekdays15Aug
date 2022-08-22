package com.objectcreationdemo;

public class ObjectCreationDemo {

	private String empname = "";
	private String emp_number = "";
	private String dep = "";

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmp_number() {
		return emp_number;
	}

	public void setEmp_number(String emp_number) {
		this.emp_number = emp_number;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public static void main(String[] args) {
		ObjectCreationDemo emp1= new ObjectCreationDemo();
		ObjectCreationDemo emp2= new ObjectCreationDemo();
		
		System.out.println(emp1.getEmpname());
		System.out.println(emp2.getEmpname());
		
		System.out.println(emp1.getEmp_number());
		System.out.println(emp2.getEmp_number());
		
		System.out.println(emp1.getDep());
		System.out.println(emp2.getDep());
		
		System.out.println("................................");
		
		emp1.setEmp_number("e001");
		emp2.setEmp_number("e002");
		
		emp1.setEmpname("Computer");
		emp2.setEmpname("Monitor");
		
		emp1.setDep("Software");
		emp2.setDep("Hardware");
		
		System.out.println(emp1.getEmpname());
		System.out.println(emp2.getEmpname());
		
		System.out.println(emp1.getEmp_number());
		System.out.println(emp2.getEmp_number());
		
		System.out.println(emp1.getDep());
		System.out.println(emp2.getDep());
		
		System.out.println("end of the program.......");
	}

}
