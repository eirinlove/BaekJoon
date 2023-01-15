import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		while(n!=0) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int d = scan.nextInt();
			int e = scan.nextInt();
			System.out.print("$");
			System.out.print((String.format("%.2f",(a*350.34 + b*230.90 + c*190.55 + d*125.30 + e*180.90))));
			System.out.println();
			n--;
		}
	}
}
