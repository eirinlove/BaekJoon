import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	long x = scan.nextInt();
	long y = scan.nextInt();
	
	System.out.println((long)(x*y)/euclid(x,y));
}



static long euclid(long x, long y) {
	long g=0;
	while (y!=0) {
		g = x%y;
		x = y;
		y = g;
	}
	
	return x;
	
	
	
}
}