import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int j = scan.nextInt();
		
		int[] array = new int[i];
		
		for (int num=0; num<i; num++ ) {
			
			array[num] = scan.nextInt();
			
			
			if (array[num] < j) {System.out.print(array[num]+" "); }
			
			
		}
	
		scan.close();
		

		
		
	}
	
}
