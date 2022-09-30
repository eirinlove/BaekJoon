import java.util.Scanner;
import java.math.BigInteger;


public class Main {
public static void main(String[] args) {
	

	Scanner scan = new Scanner(System.in);
	BigInteger a = scan.nextBigInteger();
	BigInteger b = scan.nextBigInteger();	
	BigInteger divide = new BigInteger("2");
	
	
	
	BigInteger N = (a.subtract(b).divide(divide).add(b));
	BigInteger M = (a.subtract(b).divide(divide));
	
	System.out.println(N);
	System.out.println(M);
	
	
	
	
}
}
