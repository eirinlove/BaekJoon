import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int temp = 5;
		
		while(temp != 0){
			
			int n = scan.nextInt();
			System.out.print(n-(a*b)+" ");
			
			temp--;
		}
		
	}
}
