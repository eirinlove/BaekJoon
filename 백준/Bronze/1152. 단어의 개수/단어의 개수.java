import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		String spell = scan.nextLine();
		
//		String[] answer = new String[(spell.split(" ")).length]; 처음 공백 인식함.
		StringTokenizer answer = new StringTokenizer(spell," ");
		
		
		System.out.println(answer.countTokens());
		scan.close();
	}
	
}