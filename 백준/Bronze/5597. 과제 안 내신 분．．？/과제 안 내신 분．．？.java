import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	
	Scanner scan = new Scanner(System.in);
	
	int[] a =  new int[31];
	
	for(int i = 1 ; i <29; i++) {
		
		int b = scan.nextInt();
		a[b] = 1;
		
	}
	
	for(int i =1; i<31; i++) {	
			
		if(a[i] != 1) {
			
			System.out.println(i);
		}
		
	}
	
}
}
