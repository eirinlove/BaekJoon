import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a+b>= c * 2 ) {
			System.out.println((a+b)-(c*2));
			
		}
		else { System.out.println(a+b);}
	}
}