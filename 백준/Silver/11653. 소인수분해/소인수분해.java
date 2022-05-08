import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		scan.close();
		//int count = 0;
		int i = 2;
		while(true) {
			if (num == 1) { break; } // 1은 구할 수 없음.
			
			if(num%i ==0) {
				
				// i 는 소인수 
				num = num/i;
				System.out.println(i); //몫을 내놓음
			}
			
			
			else {i++; }
			
		}
		
	}
}
