package exceptiondemo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
	
	
  
  
  public static void main(String[] args)    {
 
      
      File newFile = new File("./test.txt");
		
      try {
		FileInputStream stream = new FileInputStream(newFile);
	} 
      
      catch (FileNotFoundException e) {
		e.printStackTrace();
	}
      
      
      System.out.println("end of the program.....");
	
 
 
  }
}