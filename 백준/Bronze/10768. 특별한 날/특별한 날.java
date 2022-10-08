import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		if(b.length() == 1) {
			
			b= "0"+b;
		}
		
	
		
		if(Integer.parseInt(a+b)>218) {
			
			System.out.println("After");
		}
		
		else if (Integer.parseInt(a+b)<218) {
			
			System.out.println("Before");
		}
		
		else {
			System.out.println("Special");
		}
		
	}
	
}
