import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	
	System.out.println(Math.min(b, c) + Math.min(a-b, a-c));
}
}
