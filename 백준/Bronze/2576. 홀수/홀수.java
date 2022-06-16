import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> go = new ArrayList<Integer>();
		int temp = 0;
		for(int i = 0; i<7; i++) {
			int y = scan.nextInt();
			
			if (y%2 != 0) {
				
				go.add(y);
				temp+= y;
				
				
						}
			
		}
		if(temp!=0) {
			Collections.sort(go);
			System.out.println(temp);
			System.out.println(go.get(0));
			
		}
		
		else {System.out.println("-1");}
	}
}