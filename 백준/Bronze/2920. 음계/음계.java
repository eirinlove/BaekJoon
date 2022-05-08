import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[8];
		int status = 0;
		boolean sw = true;
		
		for(int i=0; i<8; i++) {
			
			num[i] = scan.nextInt();
			
		}
		
		for (int i=0; i<8; i++) {
			
			if(num[i] != i+1) {
				
				status = 0;
				break;
			}
			
			else if(num[i] == i+1 && num[0] == 1) {status = 1; sw=false;}
			
		}
		
		
		if ( sw == true) {
		
		for (int i=0; i<8; i++) {
			
			if(num[i]!=(8-i)) {
				
				status = 0;
				break;
			}
			else if (num[i]==(8-i) && num[0] == 8 ){status = 2;}
		}
		
		}
		
		
		if ( status == 1 ) {
			System.out.println("ascending");
			
		}
		
		else if ( status == 2 ) {
			
			System.out.println("descending");
		}
		else { System.out.println("mixed");}
		
		
		
	}
}