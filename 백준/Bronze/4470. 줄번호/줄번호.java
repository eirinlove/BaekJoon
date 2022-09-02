import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	scan.nextLine();
	String[] Array = new String[n];
	
	for(int i =0; i<n; i++) {
		
		Array[i] = scan.nextLine();
	
	}
	
	for(int i=0; i<n; i++) {
		
		System.out.println((i+1)+". "+Array[i]);
		
	}
	
}
}
