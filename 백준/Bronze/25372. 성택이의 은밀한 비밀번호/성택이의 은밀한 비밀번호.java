import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		while(a != 0) {
			
			String b = scan.next();
			if(b.length()>= 6 && b.length() <= 9) {
				
				System.out.println("yes");
			}
			
			else { System.out.println("no");
			}
			
			a--;
		}
	}
}
