import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int hab = 0;
		for(int i=0; i<5; i++) {
			
			hab += scan.nextInt();
		}
		
		System.out.println(hab);
		
	}
	
}