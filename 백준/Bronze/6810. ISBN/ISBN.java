import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int a = scan.nextInt();
	int b = scan.nextInt()*3;
	int c = scan.nextInt();
	
	int temp = 91;
	
	temp = temp+a+b+c;
	
	System.out.println("The 1-3-sum is "+temp);
	
	
}
}
