package exceptiondemo3;

public class InvalidAgeException  extends Throwable  
{  
	
    
    public InvalidAgeException ()  
    {  
        // calling the constructor of parent Exception  
        super();  
        System.out.println("no argument constructor invoked for InvalidAgeException class");
    } 
    
    
    public InvalidAgeException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
        System.out.println(" argument constructor invoked......");
    } 
    
    public InvalidAgeException (int str)  
    {  
        // calling the constructor of parent Exception  
        super(String.valueOf(str));  
        System.out.println(" argument constructor invoked......"+str);
    } 
} 