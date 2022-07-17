import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	
	double X = scan.nextDouble();
	double Y = scan.nextDouble();
	double Z  = scan.nextDouble();
	
	

	int i = (int)((X*Y)/Z);
	int j = (int)((X/Y)*Z);
	
	System.out.println((int)(i > j ? i:j));
	
	
}
}
