import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int round = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		
		while(a != b ) {
			
			
			a = a / 2 + a % 2; // 두명이서 한명의 승자가 나옴  
			b = b / 2 + b % 2; 
			count++;
		} // 라운드가 몇 라운드가 주어지건 간에 만나는 경우만 확인하면 되므로, a b의 정보를   
			// 시작하는 순서이면서, 다음 라운드의 순서로 할당하면 round 인수를 사용할 이유가 없음.
		System.out.println(count);
		
	}
	
}