import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i =1; i<=n; i++) {
			
			for(int y= i; y < n; y++) System.out.print(" ");
			
			
			
			for(int j =0; j < i*2-1; j++) System.out.print("*");
			
			System.out.println();
			
			
		}
		
		
	}
}