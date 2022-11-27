package comparabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDemoSortingImp {
	
	public static void main(String args[]) {
		
		ArrayList<StudentDemoSorting> al = new ArrayList<StudentDemoSorting>();
		
		StudentDemoSorting s1 = new StudentDemoSorting(101, "Vijay", 23);
		StudentDemoSorting s2 = new StudentDemoSorting(106, "Ajay", 27);
		StudentDemoSorting s3 = new StudentDemoSorting(105, "Jai", 11);
		StudentDemoSorting s4 = new StudentDemoSorting(104, "Rai", 40);
		StudentDemoSorting s5 = new StudentDemoSorting(108, "Yai", 29);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
//		Collections.sort((List<T>) al);
		
		for (StudentDemoSorting st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}