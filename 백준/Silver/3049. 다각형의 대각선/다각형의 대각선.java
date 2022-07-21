import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int N = scan.nextInt();
	scan.close();
	
	System.out.println((N*(N-1)*(N-2)*(N-3))/(1*2*3*4));
	
}
}
