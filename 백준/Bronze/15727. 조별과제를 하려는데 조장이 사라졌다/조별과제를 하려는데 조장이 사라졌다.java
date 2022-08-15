import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		n = (n%5) >= 1 ? 1+(n/5) : (n/5);
		
		System.out.println(n);
		
		
	}
}