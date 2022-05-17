import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int L = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		scan.close();
		while(A > 0 || B > 0 ) {
			
			A -= C;
			B -= D;
			L--;
			
			
		}
		
		System.out.println(L);
		
	}
	
}