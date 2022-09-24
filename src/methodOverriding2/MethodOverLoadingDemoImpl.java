package methodOverriding2;

public class MethodOverLoadingDemoImpl {

	public static void main(String[] args) {

		MethodOverLoadingDemoChild obj = new MethodOverLoadingDemoChild();
		obj.show(15.6f);
		obj.show(15.44);
		obj.show(100);
		obj.x = 500;
		obj.show(obj);
		obj.show("Hello");
		obj.show('A');
		obj.show();
		obj.show(true);
		
		new MethodOverLoadingDemoChild().show();
		new MethodOverLoadingDemoChild().show(100.55, 200);
	}

}
