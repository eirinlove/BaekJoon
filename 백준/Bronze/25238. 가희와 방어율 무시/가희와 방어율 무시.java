import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		double a = scan.nextInt();
		double b = scan.nextInt();
		

		
		if((a*(100-b)/100) >= 100){
			
			System.out.println("0");
		}
		
		
		else {
			
			System.out.println("1");
		}
	}
}
