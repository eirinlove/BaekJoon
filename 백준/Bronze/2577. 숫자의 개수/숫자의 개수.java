import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		int[] i = new int[3];
		int[] y = new int[10];
		int find = 0;
	
		for (int num=0; num<3; num++) {
			
			i[num] = scan.nextInt();
		}
		
		find = i[0]*i[1]*i[2];
		
		while (find != 0) {
			
			y[find % 10]++;
			find = find / 10;
			
			
		}
		

		
		for (int num=0; num<y.length; num++) {
			
			System.out.println(y[num]);
			
		}
		
		
		
		
	}
	
}
