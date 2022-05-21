import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	
	int num = scan.nextInt();
	int ob = scan.nextInt();
	int count = 0;
	for(int i=1; i<=num; i++) {
		
		String object = Integer.toString(i);
		for(int j = 0; j<object.length(); j++) {
			
			if(Character.getNumericValue(object.charAt(j)) == ob ) {
				//System.out.println("숫자: "+i+" 카운트 :"+count);
				count++;
			}
		}
		
		
		
	}
	
	System.out.println(count);
	
	
	
}
}