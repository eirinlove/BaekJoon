import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		while(true) {
			
			int i = scan.nextInt();
			int j = scan.nextInt();
			
			if ( i==0 && j==0) {
				
				scan.close();
				break;
			}
			
			System.out.println(i+j);
		}

	}
	
}