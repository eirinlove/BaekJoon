import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int hour = scan.nextInt();
	int minute = scan.nextInt();
	int second = scan.nextInt();
	
	
	int n = scan.nextInt();
	
	
	
	
	second += n;
	minute += second/60;
	second = second % 60;
	
	hour += minute/60;
	minute = minute % 60;
	hour = hour % 24;
	
	
	System.out.print(hour+ " "+minute+" "+second);
	
	
	
	
	
}
}