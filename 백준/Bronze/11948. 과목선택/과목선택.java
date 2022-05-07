import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Integer[] first = new Integer[4];
		Integer[] second = new Integer[2];
		
		
		for (int i=0; i<4; i++) {
			
			first[i] = scan.nextInt();
			
		}
		
		for (int i=0; i<2; i++) {
			
			second[i] = scan.nextInt();
		}
		
		Arrays.sort(first, Collections.reverseOrder());
		Arrays.sort(second, Collections.reverseOrder());
		System.out.println(first[0]+first[1]+first[2]+second[0]);
		
		
	}
}