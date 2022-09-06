import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int a1 = scan.nextInt();
	int a2 = scan.nextInt();
	int a3 = scan.nextInt();
	
	int temp =0;
	
	temp = (a1*1)+(a2*2)+(a3*3);
	
	
	if(temp >= 10) {
		
		System.out.println("happy");
	}
	
	else {
		
		System.out.println("sad");
	}
	
	
}
}
