import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
	
		int c = scan.nextInt();
	
		
		a = a%b;
		
		for (int i =0; i <c-1; i++) {
			
			a = a*10;
			a = a%b;
			
		}
		a = a*10;
		
		System.out.println(a/b);
}
}