import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int[] Array = new int[3];
	
	for(int i=0; i<3; i++) {
		
		Array[i] = scan.nextInt();
		
	}
	

	if(Array[0] ==60 && Array[1] == 60 && Array[2] == 60) {
		
		System.out.println("Equilateral");
	}
	
	else if (Array[0] + Array[1] + Array[2] == 180 && ((Array[0] == Array[1]) || (Array[1] == Array[2] || Array[2] == Array[0]))) {
		
		
		System.out.println("Isosceles");
	}

	else if (Array[0] + Array[1] + Array[2] == 180 && ((Array[0] != Array[1]) || (Array[1] != Array[2] || Array[2] != Array[0]))) {
	
		System.out.println("Scalene");
	}
	
	else {
		
		System.out.println("Error");
	}
}
}
