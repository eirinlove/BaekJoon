import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	
	int[] Array = new int[n];
	
	for(int i=0; i<n; i++) {
		
		Array[i] = scan.nextInt();
		
	}
	
	int N = scan.nextInt();
	int temp = 0;
	
	for(int i=0; i<n; i++) {
		
		if(Array[i] == N ) {
			
			temp++;
		}
		
	}
	
	System.out.println(temp);
	
}
}