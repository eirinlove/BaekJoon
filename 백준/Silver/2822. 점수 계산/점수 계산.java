import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> Array = new ArrayList<>(); 
		ArrayList<Integer> Array_2 = new ArrayList<>();
		ArrayList<Integer> Array_3 = new ArrayList<>();
		for(int i=0; i<8; i++) {
			
		int b = scan.nextInt();
		Array.add(b);
		Array_2.add(b);	
		}
		
		
		Array.sort(Comparator.reverseOrder());
		int temp = 0;
		
		
		for(int i = 0; i<5; i++) {
			
			temp += Array.get(i);
			
		}
		
		System.out.println(temp);
		
		int loman=0;
		for(int i=0; i<8; i++) {
			
			for(loman=0; loman<5; loman++) {
			if(Array.get(loman).equals(Array_2.get(i))) {
				
				Array_3.add(Array_2.indexOf(Array.get(loman)));
				loman++;
				
			}
			
			
		}
		}

	
		
		for(int i=0; i<5; i++) {
			
			
			if(i!=4) {
			System.out.print(Array_3.get(i)+1+" ");
			}
			
			else {
				System.out.println(Array_3.get(i)+1);
				
			}
		}
			
	
		
		
		
	}
}