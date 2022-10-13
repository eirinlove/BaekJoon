import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
	

	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	
	double c = 1 / (1 + Math.pow(10, (b-a)/400.0));
	System.out.println(c);
}
}