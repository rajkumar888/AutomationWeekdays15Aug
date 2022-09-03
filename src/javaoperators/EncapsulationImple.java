package javaoperators;

import inheritanceDemo.EncapsulationDemo;

public class EncapsulationImple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationDemo obj = new EncapsulationDemo();
		
		obj.setX(100);
		obj.setStr("Testing");

			System.out.println(obj.getX());
			System.out.println(obj.getStr());
	}

}
