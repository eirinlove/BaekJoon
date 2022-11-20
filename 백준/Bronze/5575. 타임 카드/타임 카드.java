import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	for(int i =0; i<3; i++) {
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		int f = scan.nextInt();
		
		
		int go = (a * 3600) + (b * 60) + c;
		int back = ( d * 3600) + ( e * 60) + f;
		
		int ob = back-go;
		
		int w = ob/3600;
		
		
		int po = (ob%3600) / 60;
		int x = (ob%3600) % 60;
		
		
		
		
		System.out.println(w+" "+po+" "+x);
		
		
	}
}
}
