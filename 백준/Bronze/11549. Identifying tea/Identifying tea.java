import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	int[] array = new int[5];
	
	for(int i =0; i<5; i++) {
		array[i] = scan.nextInt();
	}

	
	int temp = 0;
	for(int i=0; i<5; i++) {
		if(n==array[i]) {
			temp++;
		}
	}
	System.out.println(temp);
	
}
}