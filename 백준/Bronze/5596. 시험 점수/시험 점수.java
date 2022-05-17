import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] minkook = new int[4];
		int[] manse = new int[4];
		int minkook_s =0;
		int manse_s =0;
		
		for(int i=0; i<minkook.length; i++) {
			
			minkook_s+= scan.nextInt();
		}
		for(int i=0; i<manse.length; i++) {
			
			manse_s+= scan.nextInt();
		}
		
		if (minkook_s > manse_s) {
			
			System.out.println(minkook_s);
		}
		
		else if (minkook_s< manse_s) {
			
			System.out.println(manse_s);
		}
		else {System.out.println(minkook_s);}
		
		
	}
	
}