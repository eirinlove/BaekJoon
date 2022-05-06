import java.util.Scanner;

public class Main {
public static void main(String[] args) { 
    	
    	
    	Scanner scan = new Scanner(System.in);
    	
    	
    	String a = scan.next();
    	String a1 = scan.next();
    	String b  = scan.next();
    	String c = String.valueOf(Integer.parseInt(a1) + Integer.parseInt(b));
    	
    	
    	while ( Integer.parseInt(c) >= 60 ) {
    		
    		a =   String.valueOf(Integer.parseInt(a) + 1);
    		c = String.valueOf(Integer.parseInt(c) - 60);
    		
    		
        	if ( Integer.parseInt(a) >= 24  ) {
        		
        		
        		a = String.valueOf(0);
        		
        	}
    	
    	}
    	


    	

   
    	System.out.println(a+" "+c);
    	
    	
    	
    	
    	
    	
}
}