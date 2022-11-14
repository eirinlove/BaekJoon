import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int a[] = new int[3];
	
	for(int i=0; i<a.length; i++) {
		a[i] = scan.nextInt();
	}
	
	Arrays.sort(a);
	System.out.println(a[1]);
}
}
