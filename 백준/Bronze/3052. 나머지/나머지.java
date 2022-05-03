import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] Array = new int[10];
		int[] find = new int[42];
		Arrays.fill(find, 0);
		int temp = 0;
		for (int i=0; i<Array.length; i++) {
			
			Array[i] = scan.nextInt();
			
		}
		
	
		for(int i=0; i<10; i++) {
			
			
			find[Array[i]%42]++; 
			
		}
		
		for (int i =0; i<find.length; i++) {
			
			if (find[i]>=1) {
				
				temp++;
			}
			
		}
		
		System.out.println(temp);
		
		
		
	}
}
