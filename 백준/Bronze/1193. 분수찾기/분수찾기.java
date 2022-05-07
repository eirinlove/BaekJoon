import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int firstNum = 1;
		int secondNum = 0;
		scan.close();
		
		
		Solution(num,firstNum,secondNum);
	

	}
	
	
	public static void Solution(int x, int y, int z) {
	
		for (int i=0;; i++) {
			if (x <= y + z) {
				
				if ( y % 2 == 1 ) {
					System.out.println((y-(x-z-1))+"/"+(x-z));
					break;
				}
				
				else if (y % 2 == 0 ) {
					System.out.println((x-z)+ "/" + (y-(x-z-1)));
					break;
				}
			}
			
			else { z = z + y;
					y++;} // 단계 증가
			
	}
		
	
	}
	
}