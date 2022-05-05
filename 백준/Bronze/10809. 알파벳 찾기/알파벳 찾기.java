import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String spell = scan.next();
		String[] Array = new String[spell.length()]; 
		Array = spell.split("");
		
		int[] chkArray = new int[125];
		
		//System.out.println(spell.length());
		
		Arrays.fill(chkArray, -1);
	
		
		for(int num=0; num<Array.length; num++) {
			//System.out.println( (int) Array[num].charAt(0));
			if(chkArray[(int) Array[num].charAt(0)] == -1) {
				
				chkArray[(int) Array[num].charAt(0)] = num;
			}
			
		}
		for (int num=97; num<123; num++) {
			
			System.out.print(chkArray[num]+" ");
		}
		
	}
}