import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		scan.close();
		
		System.out.println((double) Math.pow(i, 2)*Math.PI);
		System.out.println(Math.pow(i, 2)*2);
		
		
	}
	
}