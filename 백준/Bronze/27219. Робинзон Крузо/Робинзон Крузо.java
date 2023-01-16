import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	
	while(n!=0) {
		if(n-5 >= 0) {
			System.out.print("V");
			n-=5;
		}
		else {
			System.out.print("I");
			n--;
		}
		
		
	}
}
}