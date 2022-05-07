import java.math.BigInteger;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	BigInteger money = scan.nextBigInteger();
	BigInteger monster = scan.nextBigInteger();
	
	scan.close();
	System.out.println(money.divide(monster));
	System.out.println(money.remainder(monster));
	

}
}