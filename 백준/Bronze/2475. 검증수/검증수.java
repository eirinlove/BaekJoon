import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		for(int i=0; i<5; i++) {
			
			num[i] = scan.nextInt();
			
		}
		
		System.out.print((int) (Math.pow(num[0], 2)+Math.pow(num[1], 2)+Math.pow(num[2], 2)+Math.pow(num[3], 2)+Math.pow(num[4], 2))%10);
		
		
		
		
	}
}