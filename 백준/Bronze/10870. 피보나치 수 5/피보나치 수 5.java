import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.close();
		System.out.println(fibo(n));
		
		
	}
	
	
static int fibo(int n) {
	
	// 0부터 n까지 돌아야 되네
	if (n == 0 ) { return 0; } 
	if (n == 1 ) { return 1; } // 0은 0, 1항은 1임.
	return fibo(n-2)+fibo(n-1); // n-2  , n-1이 계속 +  
	
	
}
	
}