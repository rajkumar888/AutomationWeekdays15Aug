package interfacedemo;

public interface InheritanceOfInterface extends Shape,DemoInterface111{

	@Override
	default void showDate() {
		
		DemoInterface111.super.showDate();
	}

}
