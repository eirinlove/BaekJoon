import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		long x = scan.nextLong();
		long y = 0;
		long c = 0;
		
		
		for(int i=1;; i++) {
			
			if(y>x) {
				
				break;
			}
			y+=i;
			c++;
		}
		
		System.out.println(c-1);
	}
}