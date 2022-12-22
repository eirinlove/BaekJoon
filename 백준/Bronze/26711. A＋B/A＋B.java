import java.math.BigInteger;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	BigInteger bigA = scan.nextBigInteger();
	BigInteger bigB = scan.nextBigInteger();
	
	System.out.println(bigA.add(bigB));
}
}
