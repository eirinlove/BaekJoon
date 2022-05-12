import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int i = scan.nextInt();
		int j = 666;
		int c = 1;
		String text = "";
		while(c < i) { // 입력받은 수가 카운트 될때까지 계속 더해야함.
			j++;
			text = String.valueOf(j);
			//ystem.out.println(text);
			if(text.contains("666")) { //비교대상에 "666"이 포함되는가?
			//System.out.println("짜잔");
			//666 포함되면 카운트
			c++;
			
			}
			 // 비교 대상을 1씩 더하게 됨
			
		}
		
		System.out.println(j);
		

	}
	
}