import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	
	
	while(n !=0) {
	String a = scan.next();
	String b = scan.next();
	
	a = a.replaceAll(b, "1");
	
	System.out.println(a.length());
	
	n--;
	}
	
}
}
