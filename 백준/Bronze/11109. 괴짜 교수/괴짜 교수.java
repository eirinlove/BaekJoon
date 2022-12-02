import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	while(n!=0) {
		int a =scan.nextInt();
		int b =scan.nextInt();
		int c =scan.nextInt();
		int d =scan.nextInt();
		if(a+(d*b) == b*c) {
			
			System.out.println("does not matter");
		}
		else if (a+(d*b) > b*c) {
			
			System.out.println("do not parallelize");
		}
		else {
			
			System.out.println("parallelize");
		}
		
		n--;
	}
}
}