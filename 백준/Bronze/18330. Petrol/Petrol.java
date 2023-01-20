import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int c = scan.nextInt();
		
		int f = 0;
		
		if(c+60 > n){
			f= n;
		}
		else{
			f= c+60;
		}

		System.out.println((f*1500) + ((n-f)*3000));
		
		
		
	}
}
