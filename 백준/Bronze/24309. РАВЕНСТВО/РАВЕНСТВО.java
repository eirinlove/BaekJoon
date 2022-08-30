import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		BigInteger c = scan.nextBigInteger();
		
		BigInteger d = (b.subtract(c)).divide(a);
		
		System.out.println(d);
		
	}
}
