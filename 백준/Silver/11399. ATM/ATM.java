import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] Array = new int[num];
		
		for(int i=0; i<num; i++) {
			
			Array[i] = scan.nextInt();
			
		}
		
		
		Arrays.sort(Array);
		int count =0;
		
		for(int i=1; i<=num; i++) {
			
			for(int j=0; j<i; j++) {
			count += Array[j];	
				
				
			}
			
		}
		System.out.println(count);
		
	}
}