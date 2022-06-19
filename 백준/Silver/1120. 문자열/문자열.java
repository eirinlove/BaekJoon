import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	
	String x = scan.next();
	String y = scan.next();
	int object = x.length(); // object의 기본값은, 모든 문자열이 일치하지 않은 상황임.
	scan.close();
	
	for(int i = 0; i < y.length()-x.length()+1; i++) { // 다음 문자열과 비교
		
		int count = 0;
		for(int j =0; j< x.length(); j++) {
			
			if(x.charAt(j) != y.charAt(i+j)) { // 문자열 일치 안하면 
				
				count++;  // count 증가
			}
			
		}
		
		
		if ( object > count ) {
			
			object = count;  // 하나 이상 일치하지 않은 경우,  위의 count++를 통해 초기화가 됨.
			
		}
		
		
	}
	
	System.out.println(object);
	
	
}
}
