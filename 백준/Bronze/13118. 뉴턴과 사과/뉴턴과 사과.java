import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> Array = new ArrayList<>();
		ArrayList<Integer> Array_2 = new ArrayList<>();
		
		for(int i=0; i<4; i++) {
			
			int j = scan.nextInt();
			Array.add(j);
			
		}
		
		for(int i=0; i<3; i++) {
			
			int j = scan.nextInt();
			Array_2.add(j);
			
		}
		
		if(Array.contains(Array_2.get(0))) {
			
			System.out.println(Array.indexOf(Array_2.get(0))+1);
			
		}
		
		else {
			System.out.println("0");
			
		}
		
		
	}
}
