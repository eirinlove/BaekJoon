import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	
	if(a==b && a!=c && b!=c) {
		
		System.out.println("C");
	}
	
	else if (a==c && b!=a && b!=c) {
		
		System.out.println("B");
	}
	
	else if (b==c && a!=b && a!=c) {
		
		System.out.println("A");
	}
	
	else {
		
		System.out.println("*");
	}
	
}
}