package exceptiondemo6;

public class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
        System.out.println(" argument constructor invoked......");
    }  
    
    public InvalidAgeException ()  
    {  
        // calling the constructor of parent Exception  
        super();  
        System.out.println("no argument constructor invoked for InvalidAgeException class");
    } 
} 