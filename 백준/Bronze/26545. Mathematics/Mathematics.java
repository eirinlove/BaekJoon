import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int temp = 0;

		for(int i=0; i<n; i++) {
			
			temp += scan.nextInt();
			
		}
	
		
	
	System.out.println(temp);
}
}
