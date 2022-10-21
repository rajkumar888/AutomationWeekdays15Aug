package collectionsList;

public class GreeterTest {
    
    public static void main(String[] args) {
         
        // Anonymous Inner class 1
        Greeter englishGreet = new Greeter() 
        {
            // This is equivalent code of extending Greeter class and then overriding wish() method
            public void wish() {
                System.out.println("Hi from main method...");
            }
        };
        
    
        
        englishGreet.wish(); 
        
        
        Greeter outerGreet = new Greeter();
        outerGreet.wish(); 
    }
}