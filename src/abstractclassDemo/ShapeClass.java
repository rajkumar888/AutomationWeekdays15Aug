package abstractclassDemo;

public abstract class ShapeClass {
	
	
	
	
	public abstract int getArea();
	public abstract int getPerimeter();
	
	
	public ShapeClass(){
		System.out.println("ShapeClass default constucotr is called ");
	}
	
	public ShapeClass(String str){
		System.out.println("Message from ShapeClass parameterized cons "+str);
	}
	
	public ShapeClass(int x){
		System.out.println("ShapeClass parameterized integer constructor "+x);
	}

}
