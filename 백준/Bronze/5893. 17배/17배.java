import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String num = scan.next();
		String app ="";
		BigInteger num2 = new BigInteger("0");
		int springNum =0;
		ArrayList<Integer> spring = new ArrayList<>();
		
		for(int i =0; i<num.length(); i++) {
			
			if(num.charAt(i)=='1') {num2 = num2.add(new BigInteger("2").pow(num.length()-(i+1)));}
			else if (num.charAt(i)=='0') {num2 = num2.add(new BigInteger("0"));}
			else if (num == "0") { spring.add(0); }	
		}
		
		
		BigInteger num3 = num2.multiply(new BigInteger("17"));
		
		while(num3 != BigInteger.valueOf(0)) {app = app+num3.mod(BigInteger.valueOf(2)); num3= num3.divide(BigInteger.valueOf(2));}
		
		
		
		
		
		
		
		
		
		
		for( int i= app.length()-1; i >= 0; i--) {
			
			
			System.out.print(String.valueOf(app.charAt(i)));
		}
			
		
	}
	
	
}