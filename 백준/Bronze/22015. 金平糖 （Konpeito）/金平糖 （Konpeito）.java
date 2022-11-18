import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int[] array = new int[3];
	
	for(int i = 0; i<3; i++) {
		
		array[i] = scan.nextInt();
		
	}
	
	Arrays.sort(array);
	int temp =0;
	if(array[2]>array[1]) {
		temp+= array[2]-array[1];
		
	}
	if(array[2]>array[0]) {
		temp+= array[2]-array[0];
		
	}
	System.out.println(temp);
	
}
}
