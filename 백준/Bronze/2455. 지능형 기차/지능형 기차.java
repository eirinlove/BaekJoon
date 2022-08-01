import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> Array = new ArrayList<>();
		
		
		boolean sw = false;
		Array.add(0);
		
		for(int i =0; i<4*2; i++) {
			
		
			if(!sw) {
				
				int a = Array.get(i);
				int b = scan.nextInt();
				Array.add(i+1, a-b);
				
			}
			
			else {
				
				int a = Array.get(i);
				int b = scan.nextInt();
				Array.add(i+1, a+b);
				
			}
			sw = !sw;
			
			
		}
		
		Collections.sort(Array, Collections.reverseOrder());
		
		System.out.println(Array.get(0));
	}
}