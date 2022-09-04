import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int i = scan.nextInt();
		int m = (i/100)*20;
		int l = (m/100)*22;
		
		System.out.print((i/100)*78+" "+(i-l));
		
	}
	
}