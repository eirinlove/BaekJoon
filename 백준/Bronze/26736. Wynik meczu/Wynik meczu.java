import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int ac = 0;
	int bc = 0;
	String a = scan.next();
	for(int i = 0; i<a.length(); i++) {
		
		if(a.charAt(i)=='A') {
			
			ac++;
		}
		
		else { bc++; }
		
	}
	
	System.out.println(ac + " : " + bc);
	
	
}
}
