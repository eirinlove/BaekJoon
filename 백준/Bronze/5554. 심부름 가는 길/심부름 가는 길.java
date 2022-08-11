import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int temp =0;
	
	for(int i=0; i<4; i++) {
		
		temp += scan.nextInt();
		
		
	}
	
	int a = temp/60;
	temp = temp%60;
	
	System.out.println(a);
	System.out.println(temp);
	
}
}
