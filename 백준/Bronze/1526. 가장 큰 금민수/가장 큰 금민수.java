import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		int num = scan.nextInt();
		int flush = 0;
		
		for(int i=num; 0<=num; i--) {

			String str = Integer.toString(i);
			
			if(!str.contains("0") && !str.contains("1") &&!str.contains("2") &&!str.contains("3") &&!str.contains("5") &&!str.contains("6") &&!str.contains("8") &&!str.contains("9")) {
				
				flush  = i;
				break;
				
			}
			
			
		}
		
		System.out.println(flush);
		
		
		
	}
}