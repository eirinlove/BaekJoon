import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	scan.next();
	String S = scan.next();
	
	//String[] Right = {"a", "i", "u", "e", "o"};
	
	int temp = 0;
	
	for(int i=0; i<S.length(); i++){
	
		if(String.valueOf(S.charAt(i)).equals("a") || String.valueOf(S.charAt(i)).equals("i") || String.valueOf(S.charAt(i)).equals("u")|| String.valueOf(S.charAt(i)).equals("e") ||String.valueOf(S.charAt(i)).equals("o")){
			
			temp++;
		}
		
	}
	
	System.out.println(temp);
	
	
}
}
