import java.util.Arrays;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		int i = scan.nextInt();
		int[] j = new int[i];
		double temp = 0;
		
		for (int n=0; n<j.length; n++) {
			
			j[n] = scan.nextInt();
			
		}
		
		
		for (int n=0; n<j.length; n++) {
			
			temp += j[n];
		}
		
		temp = temp / j.length; 
		
		Arrays.sort(j);
		double context = (double) temp/(j[j.length-1])*100;
		System.out.println(context);

		
		
		
	}
	
	
}