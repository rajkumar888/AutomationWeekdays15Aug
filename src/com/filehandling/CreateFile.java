package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {  
    public static void main(String args[]) throws IOException {  
  
            // Creating an object of a file  
            File f0 = new File("D:/FileOperationExample.txt");   
            if (f0.createNewFile()) {  
                       System.out.println("File " + f0.getName() + " is created successfully.");  
            } else {  
                       System.out.println("File is already exist in the directory.");  
            }  
          
//            
            
            
//            System.out.println("The absolute path of the file is: " + f0.getAbsolutePath()); 
            
            
            
            try {  
                FileWriter fwrite = new FileWriter("D:/FileOperationExample.txt"); 
                
                // writing the content into the FileOperationExample.txt file  
                fwrite.write("A named location used to store related information is referred to as a File.");   
           
                // Closing the stream  
                fwrite.close(); 
                
                
                System.out.println("Content is successfully wrote to the file."); 
                
                
            } catch (IOException e) {  
                System.out.println("Unexpected error occurred");  
                e.printStackTrace();  
                }  
            
            
            try {  
                // Create f1 object of the file to read data  
                File f1 = new File("D:/FileOperationExample.txt");
                
                Scanner dataReader = new Scanner(f1);  
                
                while (dataReader.hasNextLine()) {  
                    String fileData = dataReader.nextLine();  
                    System.out.println(fileData);  
                }  
                dataReader.close(); 
                
            } catch (FileNotFoundException exception) {  
                System.out.println("Unexcpected error occurred!");  
                exception.printStackTrace();  
            }  
            
            
            File f01 = new File("D:/FileOperationExample.txt");   
            if (f01.delete()) {   
              System.out.println(f01.getName()+ " file is deleted successfully.");  
            } else {  
              System.out.println("Unexpected error found in deletion of the file.");  
            }   
            
            File f1 = new File("D:/hello/test/m1/m2/m3");
            f1.mkdirs();
            
            
}  
}  