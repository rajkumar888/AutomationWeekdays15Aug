package exceptiondemo6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
	
	
  
  
  public static void main(String[] args) throws FileNotFoundException {
 
      
      File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
	
 
 
  }
}