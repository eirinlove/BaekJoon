import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);

	
	int n = scan.nextInt();
	System.out.println("Gnomes:");
	while(n!=0) {
		
		ArrayList<Integer> array = new ArrayList();
		ArrayList<Integer> test = new ArrayList();

		int chk = 0;
		
		for(int i=0; i<3; i++) {
			
			int o = scan.nextInt();
			array.add(o);
			test.add(o);
		}
		Collections.sort(test);
		
		for(int i=0; i<3; i++) {
//			System.out.print(array.get(i)+" "+test.get(i));
//			System.out.println();
			if(array.get(i) != test.get(i) && chk<1) {
				
				chk++;
			}
		}
		
		Collections.sort(test, Collections.reverseOrder());
		
		for(int i=0; i<3; i++) {
//			System.out.print(array.get(i)+" "+test.get(i));
//			System.out.println();
			if(array.get(i) != test.get(i)) {
				
				chk++;
			}
		}
		
		
		if(chk>2) {
			System.out.println("Unordered");
			
		}
		else {
			
			System.out.println("Ordered");
		}
		
		
		
		n--;
	}
	
	
}
}