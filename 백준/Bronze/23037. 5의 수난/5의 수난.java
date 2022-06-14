import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		String str = scan.next();
		String[] Array = new String[str.length()];
		Array = str.split("");
		int temp=0;
		for(int i=0; i<str.length(); i++) {
			
			int j  = (int) Math.pow(Integer.parseInt(Array[i]), 5);
			temp += j;
			
		}
		
		System.out.println(temp);
	}
}