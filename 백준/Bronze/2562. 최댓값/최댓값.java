import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		int[] i = new int[9];
		int temp = 0;
		int tempVar = 0;
		for (int j=0; j<9; j++) {
			
			i[j] = scan.nextInt();
			
		}

		for (int num = 0; num < 9; num++) {
			
			if (i[num] > temp) {
				
				temp = i[num];
			}

			
		}
			
		
		for (int num = 0; num < 9; num++) {
			
			if (i[num] == temp) {
				
				tempVar = num+1;
			
			
		}
			
		}
		
		
		System.out.println(temp);
		System.out.println(tempVar);
		
	}
}