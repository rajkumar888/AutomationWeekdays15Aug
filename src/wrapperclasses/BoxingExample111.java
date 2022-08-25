package wrapperclasses;

public  class BoxingExample111 {
	 
	public static void main(String[] args) {
		  
		  byte b = 100;
		  Byte B = new Byte(b); 
		  System.out.println(B);
		  
		  short s = 100; 
		  Short S = new Short(s); 
		  System.out.println(S);
		  
		  int i = 200; 
		  Integer I = new Integer(i);
		  System.out.println(I);
		  
		  long l = 250; 
		  Long L = new Long(l); 
		  System.out.println(L);

		  float f = 120L; 
		  Float F = new Float(f);
		  System.out.println(F);

		  double d = 18.58; 
		  Double D = new Double(d);
		  System.out.println(D);

		  boolean bln = false; 
		  Boolean BLN = new Boolean(bln);
		  System.out.println(BLN);

		  char c = 'C'; 
		  Character C = new Character(c); 
		  System.out.println(C);
		 }
		}