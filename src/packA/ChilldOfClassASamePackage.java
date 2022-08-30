package packA;

import packA.ClassA;

public class ChilldOfClassASamePackage extends ClassA{
	
	
	void display(){
//		System.out.println(privateA);
		System.out.println(defaultA);
		System.out.println(protectedA);
		System.out.println(publicA);
	}

}
