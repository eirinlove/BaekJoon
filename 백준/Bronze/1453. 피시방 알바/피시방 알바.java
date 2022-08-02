import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean[] 좌석 = new boolean[101];
		Arrays.fill(좌석, true);
		int n = scan.nextInt();
		int cnt = 0;
		
		while(n != 0){
			
			int 지목 = scan.nextInt();
			
			
			if(좌석[지목] == true){
				
				좌석[지목] = false;
				
			}
			
			else { cnt++; }
			
			n--;
		}
	
		System.out.println(cnt);
		
	}
	
	
}