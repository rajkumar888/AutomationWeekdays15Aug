package exceptiondemo2;

public class OutOfMemoryErrorExample {
	
	
	
	
	public static void main(String[] args) {
		
		
		
		Long maxMemory = Runtime.getRuntime().maxMemory();
		
		
		System.out.println(maxMemory);
		

		int[] matrix;
		try {
			matrix = new int[(int) (maxMemory + 1)];
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("finally block is executed....");
		}
		
		
		
		
//		for (int i = 0; i < matrix.length; ++i)
//			matrix[i] = i + 1;
		
		System.out.println("end of the program......");
		
	}
}