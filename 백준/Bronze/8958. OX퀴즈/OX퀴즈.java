import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int score = 0;
		int mvp = 0;
		
		while (N >= 1) {
			
			String ex = scan.next();
			char[] exA = new char[ex.length()];
			
			
			for (int num=0; num<exA.length; num++) {
				
				exA[num] = ex.charAt(num);
			
			
			}
			
			for (int num=0; num<exA.length; num++) {
				
				if (exA[num] == 79) { //O
					
					score = score + mvp + 1;
					mvp = mvp+1;
					
				}
				else if  (exA[num] == 88) { // X
					
					mvp = 0;
				}
				
			}
			System.out.println(score);
			mvp = 0;
			score = 0;
			N = N-1;
			
		}
		
		scan.close();
		
		
	}
}