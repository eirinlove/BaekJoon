import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	
	int a = scan.nextInt();
	int b = scan.nextInt();
	int temp = 0;
	
	temp += a*8;
	temp += b*3;
	
	System.out.println(temp-28);
	
	
	
}
	
}
