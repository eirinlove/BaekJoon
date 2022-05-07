import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int[] num = new int[5];
	int score = 0;
	
	for (int i=0; i<5; i++ ) {
		
		num[i] = scan.nextInt();
		
	}
	for (int i=0; i<5; i++) {
		
		if (num[i] < 40) {
			
			num[i] = 40;
		}
		score += num[i];
	}
	
	System.out.println(score/5);
	
		
	
	
	
	
}
}