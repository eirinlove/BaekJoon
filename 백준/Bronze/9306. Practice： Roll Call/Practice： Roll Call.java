import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	int temp =1;
	while(n!=0) {
		String a = scan.next();
		String b = scan.next();
		
		System.out.println("Case "+temp+": "+b+", "+a);
		
		
		
		temp++;
		n--;
	}
}
}
