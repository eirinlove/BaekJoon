import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int money = scan.nextInt();
	int b[] = new int[a];
	int temp = 0;
	
	for(int i = 0; i<a; i++) {
		
		b[i] = scan.nextInt();
		temp += b[i];
	}

	for(int i = 0; i<a; i++) {
		
		System.out.println((money/temp)*b[i]);
		
	}
	
}
}
