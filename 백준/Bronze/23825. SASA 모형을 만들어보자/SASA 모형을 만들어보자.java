import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int a[] = new int[2];
		
		a[0] = scan.nextInt();
		a[1] = scan.nextInt();
		
		Arrays.sort(a);
		System.out.println(a[0]/2);
	
	}	
}