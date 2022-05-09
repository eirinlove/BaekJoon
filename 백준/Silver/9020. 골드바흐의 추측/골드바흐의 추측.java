import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();

		
	for (int test=0; test<testCase; test++) {
		int num = scan.nextInt();
		
			int a  = num / 2; // a의 시작위치는 중간에서부터 탐색한다.
			int b = num - a;  // b의 탐색위치는 num - 중간위치 부터 탐색한다.
			while(!isPrime(a) || !isPrime(b)) {  // 양쪽중 하나라도 소수 아니면 계속 돌림.
				a--;
				b++;	
			} // a와 b의 간격을 점점 넓혀가, a와 b양쪽이 소수가 될때까지 받는다.
			

		System.out.println(a+" "+b); 

		
		}
		

	}


	public static boolean isPrime(int a){ // 소수인지 판별하는 메서드
		boolean o = true;
		for(int z=2; z<=Math.sqrt(a); z++) {
		if(a%z==0) {
			o = false; break;
		}
		if(o) {
			o = true; 
		}
		}
		
		return o;
	}

	}