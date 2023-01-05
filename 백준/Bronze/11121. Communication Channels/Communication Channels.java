import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	while(n!=0) {
		
		
		String a  = scan.next();
		String b  = scan.next();
		
		
		if(a.equals(b)){
			
			System.out.println("OK");
		}else {
			System.out.println("ERROR");
		}
		
		n--;
	}
}
}
