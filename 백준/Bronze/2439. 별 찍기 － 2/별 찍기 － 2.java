import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		for (int i=1; i<=x; i++) {
			
			
			for (int j=0; j<(x-i); j++) {
				
				System.out.print(" ");
				
			}
			for (int j=0; j<i; j++) {
				
				System.out.print("*");
				
			}
			
			
			System.out.print("\n");
		}
		
		scan.close();
		
	}
}