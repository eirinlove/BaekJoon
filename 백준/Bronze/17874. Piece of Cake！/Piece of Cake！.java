import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	

	int a = scan.nextInt();
	int b= scan.nextInt();
	int c= scan.nextInt();
	int d=0;
	int e=0;
	
	if(b>a-b) {
		d = b;
	}
	else {
		d = a-b;
	}
	
	if(c>a-c) {
		e=c;
	}
	else {
		e=a-c;
	}
	
	e = d*e;
	
	System.out.println(e*4);
	
	
	
	
			
}
}