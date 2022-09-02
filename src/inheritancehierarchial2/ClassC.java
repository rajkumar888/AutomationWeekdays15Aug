package inheritancehierarchial2;

import packA.ClassA;
import packB.ClassB;

public class ClassC extends ClassA {

	public int c = 100;

	public void demoOfParentChildC() {

		// System.out.println(privateA); // not allowed
		//
		// System.out.println(defaultA); // not allowed - outside of package

		System.out.println(protectedA);

		System.out.println(publicA);

		System.out.println(test);

	}

	

}
