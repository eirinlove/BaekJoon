import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();

		
		while(n!=0) {
			int p1_score = 0;
			int p2_score = 0;
			int o = scan.nextInt();
			while(o!=0) {
				String p1 = scan.next();
				String p2 = scan.next();
				if(p1.equals("R") && p2.equals("P")) {p2_score++;}
				if(p1.equals("R") && p2.equals("S")) {p1_score++;}
				if(p1.equals("P") && p2.equals("R")) {p1_score++;}
				if(p1.equals("P") && p2.equals("S")) {p2_score++;}
				if(p1.equals("S") && p2.equals("R")) {p2_score++;}
				if(p1.equals("S") && p2.equals("P")) {p1_score++;}
				o--;
			}
				if(p1_score > p2_score) {
					
					System.out.println("Player 1");
				}
				else if (p1_score < p2_score) {
					System.out.println("Player 2");
					
				}
				
				else {System.out.println("TIE"); } 
				
				
				
			
			n--;
			
			
		}
		
	}
}