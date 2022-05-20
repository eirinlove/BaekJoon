import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(numberic(a,b));
		System.out.println(a*b/numberic(a,b));
		
		
	}
	
	
	static int numberic(int a, int b) {
		
		while(b != 0 ) {
			
			int r = a % b;
			a = b;
			b = r;
			
			
		}
		
		return a;
		
		
	}
	
	
}