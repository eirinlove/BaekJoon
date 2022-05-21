import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	
	ArrayList<Integer> Array = new ArrayList<>();
	
	
	for(int i =1; i<=1000; i++) {
		
		for(int j=0; j<i; j++) {
			
			Array.add(i);
			
		}
		
	}
	
	
	Collections.sort(Array);
	int count=0;
	for(int i=num1-1; i<=num2-1; i++) {
		
		//System.out.println(Array.get(i));
		count+=Array.get(i);
		
	}
	
	System.out.println(count);
	
	
	
}
}