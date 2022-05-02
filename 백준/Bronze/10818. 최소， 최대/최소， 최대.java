import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int[] Array = new int[i];

		
		
		for(int num=0; num<i; num++) {
			
			Array[num] = scan.nextInt();
		}
		
		
		Arrays.sort(Array);
		
	
		
		System.out.println(Array[0]+" "+Array[Array.length-1]);
		
		
		scan.close();
		
				
		
		
	}
}