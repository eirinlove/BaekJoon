import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	
	int c = b-a;
	
	if(c>=1 && c<=20) {
		
		System.out.println("You are speeding and your fine is $100.");
	}
	
	else if (c>=21 && c<=30) {
		
		System.out.println("You are speeding and your fine is $270.");
	}
	else if (c>=31) {
		
		System.out.println("You are speeding and your fine is $500.");
	}
	
	else { System.out.println("Congratulations, you are within the speed limit!");}
	
}
}
