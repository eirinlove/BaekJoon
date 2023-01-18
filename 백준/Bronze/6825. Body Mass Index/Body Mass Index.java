import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Double a = scan.nextDouble();
		Double b = scan.nextDouble();
		
		Double c = a/(Math.pow(b, 2));
		if(c>25) {
			System.out.println("Overweight");
		}
		else if (c>=18.5 && c<=25) {
			System.out.println("Normal weight");
			
		}
		
		else {
			System.out.println("Underweight");
			
		}
		
	}
}
