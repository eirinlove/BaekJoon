import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str[] = new String[4];
		
		for(int i =0; i<str.length; i++) {
			
			str[i] = scan.next();
			
		}
		
		if((str[0].equals("8")||str[0].equals("9"))&&str[1].equals(str[2])&&(str[3].equals("8")||str[3].equals("9"))){
			
			System.out.println("ignore");
		}
		else {
			
			System.out.println("answer");
		}
		}
}