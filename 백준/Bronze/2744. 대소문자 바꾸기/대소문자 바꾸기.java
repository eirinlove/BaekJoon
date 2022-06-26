import java.util.Scanner;

public class Main {

	
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	String b = scan.next();
	String c = "";
	for(int i=0; i<b.length(); i++) {
		
		if(Character.isLowerCase(b.charAt(i))) {
			
			c += Character.toUpperCase(b.charAt(i));
		}
		
		else {
			
			c += Character.toLowerCase(b.charAt(i));
			
		}
		
	}
	System.out.println(c);
}
}