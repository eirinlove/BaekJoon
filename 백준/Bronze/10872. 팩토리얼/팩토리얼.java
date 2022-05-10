import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.close();
		System.out.println(factorial(n));
		
		
	}
	
	
static int factorial(int n) {
	
	
	if (n < 1) { return 1; }
	return n* factorial(n-1);
	
	
}
	
}