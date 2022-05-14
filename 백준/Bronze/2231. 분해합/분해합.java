import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int N = scan.nextInt();
	scan.close();
	int Num = 1;
	
	while(Num <= N) {
		
		int temp = Num;
		int tempPlus = Num;
		int Bonus = Num;
		int value = String.valueOf(Num).length();
		for(int i=0; i<value; i++) {
			
			tempPlus += temp%10;
			temp = temp/10;
			
		}
		//System.out.println(Num);
		
		if (Num >= N) {
			
			System.out.println("0");
			break;
		}
		else if ( tempPlus == N ) {
			
			System.out.println(Num);
			break;
		}
		Num++;
		
	}


}
}