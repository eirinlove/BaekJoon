import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	
	while(n!=0) {
		
		int i = scan.nextInt();
		
		System.out.print(i+" ");
		System.out.print(i);
		System.out.println();
		
		n--;
	}
	
}
}
