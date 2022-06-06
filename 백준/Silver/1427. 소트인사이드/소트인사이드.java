import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String N  = scan.next();
		String[] M = new String[N.length()];
		
		for(int i =0; i<M.length; i++) {
			
			M[i] = String.valueOf(N.charAt(i));
			
		}
		
		Arrays.sort(M, Collections.reverseOrder());
		
		for(int i=0; i<M.length; i++) {
			
			System.out.print(M[i]);
		}
	}
}