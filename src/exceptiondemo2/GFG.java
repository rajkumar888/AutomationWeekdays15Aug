package exceptiondemo2;

public class GFG {
	 
    // Main driver method
    public static void main (String[] args) {
 
        // Declaring a custom number whose factorial is to be computed
        int n = 5;
 
        // Print and display the factorial
        System.out.println(factorial(n));
    }
 
    // Method
    // To calculate factorial
    static int factorial(int n) {
 
        // Note: There is no termination condition
 
        // Calling recursively to compute factorial of a number
        return n * factorial(n - 1);
    }
}