package com.pack.day7;

public class Shape {
	
	public float peri=0.0f;
	
	public void perimeter(int len, int breadth){
		peri= 2* (len+breadth);
		System.out.println("Perimeter of Rect "+peri);
	}
	
	
	public void perimeter(int side){
		peri= 4*side;
		System.out.println("Perimeter of square "+peri);
	}
	
	public void perimeter(float radius){
		peri= (float) (2* (22.0/7.0)*radius);
		System.out.println("Perimeter of circle "+peri);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape obj = new Shape();
		
		obj.perimeter(10);
		
		obj.perimeter(10,5);
		
		obj.perimeter(5.8f);

	}

}
