package interfacedemo.multiple;

public interface Hockey extends Event, Sports {
	
	public static final int x=100;			// public static final
	
	public abstract void setVal(int val);
	
	public abstract int getVal();
	
	public default void testdefaultmethod(){
		System.out.println("inside default method of interface");
	}
	
	public static void methodStaticDemo(){
		System.out.println("inside static method of interface");
	}


}



