import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		String i = scan.next();
		
		String[] j = new String[2];
		String[] k = new String[2];
		k[0] = "0";
		k[1] = "0";
		
		int y = 0;
		int num = 0;
		int temp = 0;
	
		if ( Integer.parseInt(i) < 10 ) {
			
			j[0] = "0";
			j[1] = i;
			
		}
		
		else if ( Integer.parseInt(i) >= 10) {
			
			j[0] =  String.valueOf(Integer.parseInt(i)/10);
			j[1] =  String.valueOf(Integer.parseInt(i)%10);
			
		}
		
		
		while (Integer.parseInt(j[0]+j[1]) != Integer.parseInt(k[0]+k[1])) {
			
			if ( num == 0 ) {
				k[0] = j[0];
				k[1] = j[1];
				
			}
			
			temp = Integer.parseInt(k[0])+Integer.parseInt(k[1]);
			y = Integer.parseInt(k[1]+temp%10);
			//System.out.println(y);
			k[0] = String.valueOf(y/10);
			k[1] = String.valueOf(y%10);
			num += 1;
			
		}
		
		if (num == 0) {
			
			num += 1;
		}
		System.out.println(num);
		
	
		
	}
}