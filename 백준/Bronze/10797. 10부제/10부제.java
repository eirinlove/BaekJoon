import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int[] array = new int[5];
		int count = 0;
		for(int z=0; z<5; z++) {
			
			array[z] = scan.nextInt();
			
			
		}
		
		for(int z=0; z<5; z++) {
			
			if(array[z]==i) {
				
				count++;
			}
			
		}
		
		System.out.println(count);
		
		
		
	}
}
