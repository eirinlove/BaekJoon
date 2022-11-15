import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	
	for(int i =1; i<=n-1; i++) {
		
		
		System.out.print(" ");
	}
	System.out.print("*\n");
	
	for(int i = 2; i<=n; i++) {
		
		for(int j = 1; j <=n -i; j++) {
			
			System.out.print(" ");
		}
		System.out.print("*");
		
		for( int o =0; o<(i-1)*2-1; o++) {
			
			System.out.print(" ");
		}
		System.out.print("*\n");
	}
	
}
}
