package exceptiondemo2;

public class StackOverFlowErrorDemo2 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		String str="Hello";
		
		while(true){
			
			str=str.concat(" test ");
//			System.out.println(str);
//			Thread.sleep(100);
		}
		

	}

}
