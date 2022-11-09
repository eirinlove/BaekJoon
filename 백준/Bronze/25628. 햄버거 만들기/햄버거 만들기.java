import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	int a =  scan.nextInt();
	int b = scan.nextInt();
	int temp =0;
	
	while(true) {
		if(a <= 1 || b == 0) {
			
			break;
		}
		
		a= a-2;
		b--;
		temp++;
	}
	System.out.println(temp);
	
}
}
