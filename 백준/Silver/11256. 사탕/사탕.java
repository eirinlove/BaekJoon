import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int testcase = scan.nextInt();
	
	
	while(testcase != 0) {
		
		testcase--;
		int 사탕수 = scan.nextInt();
		int 상자수 = scan.nextInt();
		int temp = 0;
		int count = 0;
		Integer[] 배열 = new Integer[상자수];
		
		for(int i=0; i<상자수; i++) {
			
			int 가로길이 = scan.nextInt();
			int 세로길이 = scan.nextInt();
			배열[i] = 가로길이*세로길이;
			
		}
		
		Arrays.sort(배열, Collections.reverseOrder());
		int 순서 = 0;
		
		
		while(temp < 사탕수 ) {
			
			temp += 배열[순서];
			순서++;
			count++;
			
					
		}
		
		
		System.out.println(count);
		
		
		
		
		
		
		
	}
	
	
}
}