import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		
		
		for (int i=1; i<=x; i++) {
			
			
			int a = scan.nextInt();
			int b  = scan.nextInt();
			
			System.out.println("Case #"+i+": "+a+" + "+ b +" = "+ (a+b));
		}
		
		scan.close();
	}
}