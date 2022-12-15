import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	while(n!=0) {
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		if ( b > 10.5 && c > 7.5 && d >= 12 && (b+c+d) >= 55) {
			
			System.out.println(a+" "+(b+c+d)+" "+"PASS");}
		
			else {
				
				System.out.println(a+" "+(b+c+d)+" "+"FAIL");
				
			}
		n--;
		}
	
	}
}

