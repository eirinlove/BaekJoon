import java.util.Scanner;

public class Main {
public static void main(String[] args) { 
    	
    	
    	Scanner scan = new Scanner(System.in);
    	
    	
    	int nun1 = scan.nextInt();
    	int nun2 = scan.nextInt();
    	int nun3  = scan.nextInt();
    	int money= 0;
    	
    	if( nun1 == nun2 && nun2 == nun3 && nun3 == nun1) {
    		
    		money = 10000+(nun1*1000);
    		
    	}
    	else if (nun1 == nun2 || nun1 == nun3 ) {
    		
    		money = 1000+(nun1*100);
    		
    	}
    	else if (nun2 == nun3) {
    		
    		money = 1000+(nun2*100);
    		
    	}
    	
    	else if ((nun1 != nun2 && nun1 != nun3 ) || (nun2 != nun3) && (nun1 != nun3) ) {
    		
    		if ( nun1 > nun2 && nun1 > nun3 ) {
    			
    			money = (nun1*100);
    		}
    		else if  (nun2 > nun3 && nun2 > nun1) {
    			
    			money = (nun2*100);
    		}
    		
    		else { money = (nun3*100);}
    		
    	}
    	
    	
    	
    	
    	System.out.println(money);
    	
    	
    	
    	
}
}