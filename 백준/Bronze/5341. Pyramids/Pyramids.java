import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		int i = scan.nextInt();
		
		if(i==0) break;
		
		int temp = 0;
		for(int j=1; j<=i; j++) {
			
			temp += j;
			
		}
		
		System.out.println(temp);
		
	}
	}
}
