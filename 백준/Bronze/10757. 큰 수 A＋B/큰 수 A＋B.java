import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
	Scanner scan = new Scanner(System.in);
	BigInteger big = scan.nextBigInteger();
	BigInteger big2 = scan.nextBigInteger();
	scan.close();
	System.out.println(big.add(big2));
	
		
	}
}

