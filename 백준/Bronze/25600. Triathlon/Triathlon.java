import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	int temp = 0;
	
	
	while(n!=0) {
		
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a!=b+c) {
			
		if(a*(b+c)>=temp) {
			temp = a*(b+c);
			
		}
			
		}
		else {
			if(a*(b+c)*2>=temp) {
				
			temp = a*(b+c)*2;
			}
			
		}
		n--;
	}
	
	System.out.println(temp);
}
}