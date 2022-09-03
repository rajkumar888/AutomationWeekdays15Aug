package com.pack.exceptiondemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo
{
    public static void main(String[] args)throws  FileNotFoundException, InterruptedException, RuntimeException
    {
        Thread.sleep(10000);
        System.out.println("Hello Geeks");
        
        File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
    }
}