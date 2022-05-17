import java.util.Arrays;
import java.util.Scanner;

public class Main {


public static void main(String[] args) {
	
	
	Scanner 스캔 = new Scanner(System.in);
	
	
	int[] Array = new int[3];
	
	
	
	for (int 수 = 0; 수<Array.length; 수++){
		
		Array[수] = 스캔.nextInt();
		
	}
	
	Arrays.sort(Array);
	
	for (int 수 = 0; 수<Array.length; 수++) {
		
		System.out.print(Array[수]+" ");
	}
	
}
	
}