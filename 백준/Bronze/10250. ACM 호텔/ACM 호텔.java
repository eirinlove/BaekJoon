import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	int cases = scan.nextInt();
	
	for (int num=0; num<cases; num++) {
	
	int x = scan.nextInt();
	int y = scan.nextInt();
	int i = scan.nextInt();
	
	
	
	
	
	for( int k =1; k <=y; k++) {
		
		for ( int j =1; j<=x; j++) {
			
			i--;
			if(i==0) {
				
				System.out.println((j*100)+k);
				break;
			}
			
		}
		
		
	}
	}
	scan.close();
	}
}