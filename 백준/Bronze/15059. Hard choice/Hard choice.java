import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int[] a = new int[3];
	int[] b = new int[3];
	int temp = 0;
	for(int i =0; i<3; i++) {
		
		a[i] = scan.nextInt();
		
	}
	for (int i =0; i<3; i++) {
		
		b[i] = scan.nextInt();
	
		if( a[i]-b[i]<0) {
			
			temp += b[i]-a[i];
		}
	}
	
	
	System.out.println(temp);
	
}
}
