import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		int testCase = scan.nextInt();
		int count = 0;
		double plus = 0;
		while ( testCase >= 1 ) {
			
			testCase -=1;
			int brawler2 = scan.nextInt();
			double[] brawler = new double[brawler2];
			
			for(int i=0; i<brawler.length; i++) {
			brawler[i] = scan.nextDouble();
				
				
			}
			
			for (int i=0; i<brawler.length; i++) {
				
				plus += brawler[i];
				
			}
			for ( int i=0; i<brawler.length; i++) {
				
				if (brawler[i] > (plus/brawler.length)){
					count++;
				}
				
				
			}
			System.out.println(String.format("%.3f",((double) count/brawler.length)*100)+"%");
			
			count = 0;
			plus = 0;
		}
		
		
	}
}