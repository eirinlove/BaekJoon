import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	boolean sw = false;
	
	Scanner scan = new Scanner(System.in);
	int n =scan.nextInt();
	
	for(int i=0; i<n; i++) {
		if(sw == true) sw=false;
		else sw=true;
		for(int j=0; j<n*2; j++) {
			
			if(sw == true) {
				System.out.print("*");
				sw = false;
				
			}
			else {
				System.out.print(" ");
				sw = true;
			}
			
		}
		System.out.println();
		
	}
	
}
}
