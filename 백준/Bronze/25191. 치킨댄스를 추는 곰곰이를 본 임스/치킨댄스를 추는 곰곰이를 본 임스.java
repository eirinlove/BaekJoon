import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int d = (b/2)+c;
		
		if(d>a) {
			
			System.out.println(a);
		}
		
		else {System.out.println(d);}
	}

}
