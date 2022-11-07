import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	int[] Array = new int[3];
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	
	
	Array[0] = a;
	Array[1] = b;
	Array[2] = c;
	Arrays.sort(Array);
	if(Array[0]+Array[1]+Array[2]>=100) {
		
		System.out.println("OK");
	}

	else if(Array[0]==a) {
		
		System.out.println("Soongsil");
		
	}
	else if (Array[0]==b) {
		
		System.out.println("Korea");
	}
	
	else if (Array[0]==c) {
		
		System.out.println("Hanyang");
	}
}
	
}