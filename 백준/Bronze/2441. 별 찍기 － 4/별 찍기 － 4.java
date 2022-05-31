import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	
	for(int i=0; i<num; i++) {
		int o = i;
		
		for ( int j=0; j<num; j++) {
			
			if(o>=1) {
				System.out.print(" ");
				o--;
			}
			else { System.out.print("*");}
			
			
		}
		if(i!=num) {System.out.println();}
		
		
		
	}
	
	
}
}