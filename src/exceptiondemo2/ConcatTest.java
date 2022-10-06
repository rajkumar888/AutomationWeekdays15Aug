package exceptiondemo2;



public class ConcatTest{  
	
    @Override
	public String toString() {
		return "Welcome to ToString method called";
	}
    
    

	public static void main(String[] args) throws InterruptedException{
    	
    	
        long startTime = System.currentTimeMillis();
        
        System.out.println(startTime);
        
        StringBuffer sb = new StringBuffer("Java"); 
        
        for (int i=0; i<10000; i++){  
            sb.append(" Tpoint "+i);  
//            Thread.sleep(1);
        }
         
        long endtime = System.currentTimeMillis();
        
        System.out.println(endtime);
        
        System.out.println("Time taken by StringBuffer: " + (endtime - startTime) + "ms");  
     
        System.out.println("..................");
        
        startTime = System.currentTimeMillis();
        
        System.out.println(startTime);
        
        StringBuilder sb2 = new StringBuilder("Java");  
        
        for (int i=0; i<10000; i++){  
        	sb2.append(" Tpoint "+i);  
//            Thread.sleep(1);
        }
        
        endtime = System.currentTimeMillis();
        
        System.out.println(endtime);
        
        System.out.println("Time taken by StringBuilder: " + (endtime - startTime) + "ms"); 
        
//        System.out.println(sb2);
        
//        StringBuilder sb3 = new StringBuilder("Java");  
//        
//        System.out.println(sb3);
//        
//        Object obj = new Object();
//        System.out.println(obj);
//        
//        
//        ConcatTest obj1 = new ConcatTest();
//        System.out.println(obj1);
//        System.out.println(obj1.toString());
        
        
    }  
    
    		
}  