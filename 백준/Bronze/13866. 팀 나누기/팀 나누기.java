import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int[] Array = new int[4];
	
	for(int i =0; i<4; i++) {
		
		Array[i] = scan.nextInt();
		
		
	}
	
	
	Arrays.sort(Array);
	
	
	System.out.println(Math.abs((Array[3]+Array[0])-(Array[1]+Array[2])));
	
	
}
}