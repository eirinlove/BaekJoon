import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		scan.close();
		
		if (x > Math.abs(x-w)) {
			
			x = Math.abs(x-w);
		}
		
		if (y > Math.abs(y-h)) {
			
			y = Math.abs(y-h);
		}
		
		if (x>y) {
			
			System.out.println(y);
			
		}
		else { System.out.println(x);}
		
		
		
		
	}
	
}