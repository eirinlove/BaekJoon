import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	
	
	while(n!=0) {
		int a = scan.nextInt();
		int temp = 0;
		for(int i=0; i<a; i++) {
			
			temp+=scan.nextInt();	
		}
		System.out.println(temp);
		
		n--;
	}
	
	
}
}