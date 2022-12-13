import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int a = scan.nextInt();
	int b = scan.nextInt();
	int temp = 0;
	
	temp += ((a-9)*60)+b;
	System.out.println(temp);
}
}
