import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int aScore = 0;
		int bScore = 0;
		
		while(n!=0) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if(a > b ) aScore++; 
			else if ( b > a ) bScore++;
			
			
			n--;
		}
		
		
		System.out.print(aScore+" "+bScore);
	}
}
