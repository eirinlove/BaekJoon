import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int k = scan.nextInt();
	int[] Array = new int[N];
	
	for(int i=0; i<N; i++) {
		
		Array[i] = scan.nextInt();
		
	}
	
	Arrays.sort(Array);
	
	System.out.println(Array[Array.length-k]);
	
	
	
	
	
}
}
