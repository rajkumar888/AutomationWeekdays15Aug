package inheritanceExample;

public class EncapsulationDemo {
	
	
	private int x;
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	private String str;
	
	public EncapsulationDemo(){
		x=100;
		str="Hello";
		System.out.println("no parameter Constructor....");
	}
}
