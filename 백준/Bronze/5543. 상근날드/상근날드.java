import java.util.Arrays;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Integer[] first = new Integer[3];
		Integer[] second = new Integer[2];
		
		
		for (int i=0; i<3; i++) {
			
			first[i] = scan.nextInt();
			
		}
		
		for (int i=0; i<2; i++) {
			
			second[i] = scan.nextInt();
		}
		
		Arrays.sort(first);
		Arrays.sort(second);
		System.out.println(first[0]+second[0]-50);
		
		
	}
}