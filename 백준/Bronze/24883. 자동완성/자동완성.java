import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		
		if(a.charAt(0) =='N' || a.charAt(0)=='n') {
			
			System.out.println("Naver D2");
			
		}
		
		else {System.out.println("Naver Whale");}
		
	}
	
}