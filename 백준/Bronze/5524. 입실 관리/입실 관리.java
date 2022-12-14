import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int op = scan.nextInt();
	
	while(op!=0) {
	
	String str = scan.next();
	System.out.println(str.toLowerCase());
	op--;
	}
	
}
}
