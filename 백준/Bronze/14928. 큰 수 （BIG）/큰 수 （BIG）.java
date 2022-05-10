import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int m = 0;
		
		
		for(int num=0; num<str.length(); num++) {
			
			m = (m * 10 + (str.charAt(num)-'0'))%20000303;
		} // 자리수를 좌로 교체해나가면서 구하게 한다.

		System.out.println(m); 
		
	}
}