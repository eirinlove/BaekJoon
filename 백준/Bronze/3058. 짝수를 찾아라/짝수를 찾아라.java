import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	
	
	int n = scan.nextInt();
	
	while(n!=0) {
	
	int[] Array = new int[7];

	int temp = 0;
	int zzak = Integer.MAX_VALUE;
		for(int i=0; i<7; i++) {
			
			 Array[i] = scan.nextInt();
			 
			 if(Array[i] % 2 == 0 ) {
				if(zzak > Array[i]) {
					
					zzak = Array[i];
				}
				temp+=Array[i]; 
			 }
		
		}
		
		Arrays.sort(Array);
		System.out.println(temp+" "+zzak);
		
		
		
		n--;
	}
	
	
}
}