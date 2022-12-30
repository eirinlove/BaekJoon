import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	int d = scan.nextInt();
	int e = scan.nextInt();

	
	if(0>a) {
		
		System.out.println((Math.abs(a)*c)+d+(b*e));
	}
	else {
		
		System.out.println((b-a)*e);
	}
}
}
