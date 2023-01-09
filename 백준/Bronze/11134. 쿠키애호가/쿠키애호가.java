import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	
	while(n!=0) {
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a%b == 0) System.out.println(a/b);
		else System.out.println((a/b+1));
		
		
		
		n--;
	}
}
}
