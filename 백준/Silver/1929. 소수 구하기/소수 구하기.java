import java.util.ArrayList;
import java.util.Scanner;


public class Main {

		public static void main(String[] args) {
			
			
			Scanner scan = new Scanner(System.in);
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			scan.close();
			ArrayList<Integer> Array = new ArrayList<Integer>(); 
			
			for (;num1<=num2; num1++) {
				boolean p=true;
				for(int i=2; i<=Math.sqrt(num1); i++) {
					if(num1 % i==0) {
						p = false;
						break;					
					}
					
				}if(p && num1!=1) {System.out.println(num1); }
			}

			
		}
		
	}