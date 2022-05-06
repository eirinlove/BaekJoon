import java.util.Scanner;

public class Main{

    public static void main(String[] args) { 
    	
    	
    	Scanner scan = new Scanner(System.in);
    	
    	
    	String a = scan.next();
    	String a1 = scan.next();

    	String c = String.valueOf(Integer.parseInt(a1) - 45);
    	
    	
    
    	
    	if ( Integer.parseInt(c) < 0 ) {
    		
    		a =   String.valueOf(Integer.parseInt(a) - 1);
    		c = String.valueOf(60 + Integer.parseInt(c));
    	}
    	
    	
    	
    	if ( Integer.parseInt(a) <= 0) {
    		
    		a = String.valueOf(24 + Integer.parseInt(a));
    		
    	}
    	
    	if ( Integer.parseInt(a) == 24 ) {
    		
    		a = String.valueOf(0);
    	}
    	System.out.println(a+" "+c);
    	
    	
    	
    	
    	
    	
}
    

}