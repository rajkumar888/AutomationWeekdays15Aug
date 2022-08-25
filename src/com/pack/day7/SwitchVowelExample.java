package com.pack.day7;

public class SwitchVowelExample {    
	
	
public static void main(String[] args) {    
    char ch='z';    
   
    switch(ch)  
    {  
        case 'a':  
        case 'A': 
        case 'e':   
        case 'E':   
        case 'i':   
        case 'I':   
        case 'o':   
        case 'O':   
        case 'u':   
        case 'U':   
            System.out.println("Vowel");  
            break;  
            
        default:   
            System.out.println("Consonant");  
            break;  
    }  
}    
}  
