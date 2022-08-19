import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
	
	
	
	Scanner scan = new Scanner(System.in);
	
	int a[] = new int[3];
	int c[] = new int[3];
	
	for(int i=0; i<a.length; i++) {
		a[i] = scan.nextInt();
		
	}
	
	for(int i=0; i<c.length; i++) {
		
		c[i] = scan.nextInt();
		
	}
	
	
	System.out.println((c[0]-a[2])+" "+(c[1]/a[1])+" "+(c[2]-a[0]));
	
}
	
	
	
}
