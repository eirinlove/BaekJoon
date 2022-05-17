import java.util.Arrays;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] Array = new int[n];
		
		
		for (int i=0; i<n; i++) {
			
			Array[i] = scan.nextInt();
			
		}
		
		Arrays.sort(Array);
		
		for (int i=0; i<Array.length; i++) {
			
			System.out.println(Array[i]);
		}
		
		
	}
}