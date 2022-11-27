package exceptiondemo3;

public class OutOfMemoryErrorExample {
	
	
	
	
	public static void main(String[] args) {
		
		
		
		Long maxMemory = Runtime.getRuntime().maxMemory();
		
		
		System.out.println(maxMemory);
		

		int[] matrix = new int[(int) (maxMemory + 1)];
		
		for (int i = 0; i < matrix.length; ++i)
			matrix[i] = i + 1;
	}
}