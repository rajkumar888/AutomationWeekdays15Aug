package packC;

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

	public static void main(String[] args) {

		//

//		ClassA obja = new ClassC();
//		ClassB objb = new ClassC();
//		ClassC objc = new ClassC();

		// ClassA obj = new ClassA();

		// obj.publicA=100;

		// System.out.println(obj.protectedA);

		// System.out.println(obj.publicA);

	}

}
