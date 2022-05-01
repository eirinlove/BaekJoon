import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int y = 0;
		
		for ( int num=0; num<=i; num++ ) {
			
			
			y += num;
			
			
		}
		System.out.println(y);
		
		
		
	}
	
}