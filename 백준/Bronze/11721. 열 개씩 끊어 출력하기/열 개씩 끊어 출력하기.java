import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			count++;
			System.out.print(str.charAt(i));
			
			if(count ==10) {
				
				count = 0;
				System.out.println();
			}
		}
		
		
	}
}
