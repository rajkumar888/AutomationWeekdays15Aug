package arraysdemo;

public class ArrayDemoImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] values = { 10, 100, 1000,444};
		
		
//		System.out.println(values[0]);
//		System.out.println(values[1]);
//		System.out.println(values[2]);
		
		System.out.println(values.length);
		
		for(int i=0; i < values.length; i++){
			System.out.println(values[i]);
		}
		
		for( int xyz:values){
			System.out.println(xyz);
		}
		
		
	}

}
