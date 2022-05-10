import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	while(true) {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int[] Array = new int[3];
		
		Array[0] = a;
		Array[1] = b;
		Array[2] = c;
		
		Arrays.sort(Array); // 몇번째 받는 값이 어떤 변인지 모르므로 정렬함.
		
		
		if(Array[0]==0 && Array[1]==0 && Array[2]==0) {
			
			break;
		}
		
		if ( Math.pow(Array[0],2) + Math.pow(Array[1], 2) == Math.pow(Array[2],  2)) { 
			
			System.out.println("right");
			
		}
		
		else { System.out.println("wrong");}
		
		

		
	}
	scan.close();
}
}