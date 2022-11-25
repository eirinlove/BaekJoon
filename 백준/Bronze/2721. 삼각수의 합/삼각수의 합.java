import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	for (int i=0; i<n; i++) {
		int o = scan.nextInt();
		int temp =0;
		for(int k = 1; k<=o; k++) {
			
			temp += k * (k+1) * (k+2) /2; 
		}
		System.out.println(temp);
	}
}
}
