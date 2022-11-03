import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	for(int i =0; i<9; i++){
		
		int a = scan.nextInt();
		n -= a;
	}
	
	System.out.println(n);
	
	
}
}
