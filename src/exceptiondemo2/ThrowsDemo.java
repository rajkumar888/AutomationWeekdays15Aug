package exceptiondemo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo
{
    public static void main(String[] args) throws InterruptedException, IOException, FileNotFoundException,  NullPointerException, RuntimeException
    {
        Thread.sleep(2000);
        System.out.println("Hello Geeks");
        
        File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
		
		System.out.println("end of program....");
    }
}