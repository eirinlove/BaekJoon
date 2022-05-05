import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		String[] spell = new String[str.length()];
		spell = str.split("");
		int[] spellchk = new int[125];
		
		Arrays.fill(spellchk, 0);
		
		for (int num=0; num<spell.length; num++) {
			
			spellchk[(int)spell[num].charAt(0)] +=1;
		}
//		System.out.println(spellchk[65]);
		for (int num=0; num<27; num++) {
			
			spellchk[num] = spellchk[num+65]+spellchk[num+65+32];
		}
//		System.out.println(spellchk[3]);
		int star = 0;
		for(int num=0; num<27; num++) {
//			System.out.println(spellchk[num]);
			if (spellchk[star] < spellchk[num] ) {
				
				star = num;
//				System.out.println("스타변경"+star);
			}
		}
//		System.out.println("스타"+star);
		
		Arrays.sort(spellchk,0,26);
		
		//System.out.println("큰수"+spellchk[24]);
		
		if (spellchk[25] == spellchk[24]) {
			
			
			System.out.println("?");
		}
		else {System.out.println((char)(star+65));}
		
		
	}
}