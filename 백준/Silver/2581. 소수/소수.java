import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int c = 0;
		int setNum =0;
		scan.close();
		ArrayList<Integer> Array = new ArrayList<Integer>(); 
		
		for (;num1<=num2; num1++) {
			boolean p=true;
			for(int i=2; i<=Math.sqrt(num1); i++) {
				if(num1 % i==0) {
					p = false;
					break;					
				}
				
			}if(p && num1!=1) {setNum+=num1; Array.add(num1); c++;}
		}
		
		if (c>=1) {System.out.println(setNum); System.out.println(Array.get(0));}
		else {System.out.println("-1");}
		
	}
	
}
