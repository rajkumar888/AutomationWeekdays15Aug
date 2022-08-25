package ifelsedemo;

public class NestedIfExample {

	   public static void main(String args[]) {
	      int x = 30;
	      int y = 88;

	      if( x == 30 ) {
	         if( y == 10 ) {
	            System.out.print("X = 30 and Y = 10");
	         }  // inner if
	      }  // outer if
	   }  // main
	}  // end of class