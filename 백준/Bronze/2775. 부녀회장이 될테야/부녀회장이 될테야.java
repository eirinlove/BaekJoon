import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int testCase = scan.nextInt();
		
		
		for (int test=0; test<testCase; test++) {
		
		int c = scan.nextInt(); //층수
		int b = scan.nextInt(); //호수
		int[][] Array =  new int[b][c+1]; //길이, 열
		
		
		for(int j=0; j<Array[0].length; j++) { //j가 층, i는 호실
			
			for (int i=0; i<Array.length; i++) {

			if ( j==0 ) {
				
				Array[i][j] = i+1;
				
			}
				
			else {
				for(int z=0; z<=i; z++) {
				Array[i][j] = Array[i][j] + Array[z][j-1];

				}	
			}
			
				
			}
			
		}
		
		System.out.println(Array[Array.length-1][Array[0].length-1]);
		}
		
		
	}
	
	
}