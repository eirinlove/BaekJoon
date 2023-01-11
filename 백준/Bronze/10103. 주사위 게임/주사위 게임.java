import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	int a = 100;
	int b = 100;
	while(n!=0) {
		
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		if(c > d) b-=c;
		else if (d > c) a-=d;
		
		n--;
	}
	
	System.out.println(a);
	System.out.println(b);
}
	
}