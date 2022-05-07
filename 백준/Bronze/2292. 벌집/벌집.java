import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int count = 1;
		
		
		for(int i=1;; i++) {
			
			count += i*6;
			
			if (num == 1 ) {
				
				System.out.println("1");
				break;
			}
			
			else if (num < 1+count) {
		
				System.out.println(i+1);
				break;
			}
			
		}

		}
		
	}