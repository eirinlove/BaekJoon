import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	
	int[] Array = new int[n];
	
	
	for (int i =0; i<n; i++) {
		
	Array[i] = scan.nextInt();
		
	}
	
	int y = scan.nextInt();
	
	Arrays.sort(Array);
	int start =0;
	int end = Array.length-1;
	int result  = 0;
	
	
	while(start < end ) {
		
		if(Array[start] + Array[end] == y) {
			
			end--;
			start++;
			result++;
			
		}
		
		else if(Array[start] + Array[end] > y ) {
			
			end--;
		}
		else { start ++; }
		
	}
	System.out.println(result);
	
	
	
}
}
