import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	while(true) {
	
		
		
		int n = scan.nextInt();
		int temp = 0;
		if(n==0)break;
		for(int i=1; i<=n; i++) {
			
			temp += Math.pow(i, 2);
			
		}
		
	System.out.println(temp);
		
	}
}
}
