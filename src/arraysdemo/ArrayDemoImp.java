package arraysdemo;

import java.util.Arrays;

public class ArrayDemoImp {

	public static void main(String[] args) {
		
		int [] values = {100,444,444, 10, 60, 100, 1000,444};
		for( int xyz:values){
			System.out.println(xyz);
		}
		
		Arrays.sort(values);
		
		System.out.println(".............................");
		for( int xyz:values){
			System.out.println(xyz);
		}
		
		
//		System.out.println(values[0]);
//		System.out.println(values[1]);
//		System.out.println(values[2]);
		
//		System.out.println(values.length);
//		
//		for(int i=0; i < values.length; i++){
//			System.out.println(values[i]);
//		}
//		
//		for( int xyz:values){
//			System.out.println(xyz);
//		}
		
		
	}

}
