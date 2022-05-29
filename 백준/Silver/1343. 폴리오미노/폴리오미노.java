import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		str = str.replaceAll("XXXX", "AAAA");
		str = str.replaceAll("XX", "BB");
	
		if(!str.contains("X")) {
		System.out.println(str);
		}
		else { System.out.println("-1");}
		
		
		// XXXX 4개가 연달아 나오는 것을 전부 바꾸면 XX 혹은 X가 나눠지지 않는 수의 경우밖에 안남음
	}
	
}