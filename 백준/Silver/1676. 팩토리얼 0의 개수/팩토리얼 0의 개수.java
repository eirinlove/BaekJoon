import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		BigInteger big = new BigInteger("1");
		BigInteger big2 = scan.nextBigInteger();
		BigInteger bigSub = new BigInteger("1");
		BigInteger bigOb = new BigInteger("0");
		// Big Integer로 각 행동의 값을 정의한다 //
		while (big2.compareTo(bigOb) != 0) {
			// 반복문을 통해 BigInteger 값에 물려 팩토리얼을 구현하고
		
		big2 = big2.subtract(bigSub);
		big = big.add(big.multiply(big2));
		 
		
		}
		
		
		int count = 0;
		String num = big.toString();
		
		for(int i=num.length()-1; i>0; i--) { // 문자열 검사를 수행하여 Count 체크한다.
			
			if(num.charAt(i)=='0') {
				
				count++;
				
			}
			else if (num.charAt(i)!= '0') {
				break;
			}
			
		}
		
		System.out.println(count);
	}
}