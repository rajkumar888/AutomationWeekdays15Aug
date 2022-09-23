package labExercise;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n=10;
		int cnt=0;
		
		
		int n1=0;
		int n2=1;
		
		System.out.print(n1+" "+n2);
		
		int sum=0;
		
		do{
			sum=n1+n2;
			System.out.print(" "+sum);
			
			n1=n2;
			n2=sum;
			
		}while(cnt<n);

	}

}
