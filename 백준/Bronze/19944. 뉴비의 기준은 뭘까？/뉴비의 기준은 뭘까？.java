import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int temp = scan.nextInt();
		int num = scan.nextInt();
		
		if(temp>=num && num>=3) { System.out.println("OLDBIE!");}
		else if  ( num <= temp && num >= 1 ) { System.out.println("NEWBIE!");}
		else { System.out.println("TLE!");}
		
		
	}
}
