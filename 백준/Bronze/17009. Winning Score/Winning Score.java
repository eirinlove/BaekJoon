import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int a[] = new int[3];
	int b[] = new int[3];
	
	for(int i =0; i<3; i++) {
		
		a[i] = scan.nextInt();
	}
	for(int i =0; i<3; i++) {
		
		b[i] = scan.nextInt();
	}
	int tempA = (a[0]*3)+(a[1]*2)+a[2];
	int tempB = (b[0]*3)+(b[1]*2)+b[2];
	
	if(tempA > tempB) {
		System.out.println("A");
	}
	else if (tempA < tempB) {
		System.out.println("B");
	}
	
	else {
		
		System.out.println("T");
	}
	
}
}