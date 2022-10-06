package exceptiondemo2;

public class InvalidAgeExceptionDemo  extends RuntimeException  
{  

	public InvalidAgeExceptionDemo (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
        System.out.println(" argument constructor invoked......");
    }  
    
    public InvalidAgeExceptionDemo ()  
    {  
        // calling the constructor of parent Exception  
        super();  
        System.out.println("no argument constructor invoked for InvalidAgeExceptionDemo class");
    } 
} 