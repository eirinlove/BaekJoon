import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		
		if(N % 7 == 0 || N % 7 == 2) {
			
			System.out.println("CY");
			
		}
		
		else{
			
			System.out.println("SK");
		}
		
	}
}