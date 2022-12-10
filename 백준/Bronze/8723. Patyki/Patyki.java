import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int[] array = new int[3];
	
	for(int i=0; i<3; i++) {
		
		array[i] = scan.nextInt();
		
	}
	
	Arrays.sort(array);

	if(Math.pow(array[2], 2) == (Math.pow(array[0], 2) + Math.pow(array[1], 2))){
		
		System.out.println("1");
		
	}
	
	else if (array[0] == array[1] && array[1] == array[2]) {
		
		
	System.out.println("2");	
		
	}
	
	else {
		
		System.out.println("0");
	}
	

}
}
