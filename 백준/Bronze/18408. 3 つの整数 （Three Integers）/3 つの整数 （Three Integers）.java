import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String a[] = new String[3];
	int ab = 0;
	int bc = 0;
	for(int i = 0; i<a.length; i++) {
		
		a[i] = scan.next();
		if(a[i].equals("1")){
			ab++;
			
		}
		
		else {
			
			bc++;
		}
		
	}
	
	if(ab>bc) {
		
		System.out.println("1");
	}
	
	else {
		
		System.out.println("2");
	}
}
}