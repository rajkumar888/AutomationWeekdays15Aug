package interfacedemomulitipleinheritance;

public class HockeyImple implements Hockey {

	@Override
	public void setVal(int val) {
		// TODO Auto-generated method stub
		System.out.println(" inside hockety set value");
	}

	@Override
	public int getVal() {
		// TODO Auto-generated method stub
		System.out.println(" inside hockety get value");
		return 0;
	}
	
	public static void main(String[] args) {
		
		HockeyImple obj = new HockeyImple();
		obj.testdefaultmethod();
		
	}

}
