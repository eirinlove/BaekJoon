import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	while(n!=0) {
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		for(int i = 0; i<b; i++) {
			
			for(int j=0; j<a; j++) {
				
				System.out.print("X");
				
			}
			
			System.out.println();
		}
		System.out.println();
		n--;
	}
}
}