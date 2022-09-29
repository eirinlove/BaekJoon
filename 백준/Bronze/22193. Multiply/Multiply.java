import java.math.BigInteger;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int a = scan.nextInt();
	int b = scan.nextInt();
	BigInteger c = scan.nextBigInteger();
	BigInteger d = scan.nextBigInteger();
	
	System.out.println(c.multiply(d));
	
}
}