import java.util.Scanner;



public class Main {
	
	static String[] compare1 = {"WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW" };
	static String[] compare2 = {"BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB" };
	/* 비교 대상의 구조를 가진 스트링 배열. */
	static int compareAccess =  0;
	static int compareAccess2 = 0;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// 비교대상 문자열, 맞는 사례를 가지고 경우의수 2개에 맞춰 배열을 순서대로 비교. //  
		int a = scan.nextInt();
		int b = scan.nextInt();
		int min = 64; // 최소 경우의수는 체스판 전체 규격과 일치함.
		int c = 0;
		String[] Array = new String[a]; //세로줄 받기
		
		
		
		scan.nextLine(); // 
		
		
		for (int i=0; i< a; i++) {
			Array[i] = scan.nextLine(); // 받은 줄대로 배열저장.
		}
		
		
		for( int i=0; i<a-7; i++) {
			for(int n=0; n<b-7; n++) {
				c = minCheck(Array, i, n); // 현재 받은 Array 를 비교군으로 검사시킴.
				// 그 결과 최소값을 정의 , 비교군은 행,열이 8이 될때이므로 -7까지의 공간을 남겨둔다는 뜻임.
				if (min > c) { // 회차에서, 최소 실행 수가, 누적 최소실행수보다 적은지 검사
					min = c;
					
				}
			}
		}
		System.out.println(min); // 최소값 출력
		
		
		// 요구하는 체스판 배열은 단 2종류, BW로 시작하는것과 WB로 시작하는것.
		// 따라서, 두종류를 입력해놓고 비교를 하면 되지 않을까?
	}
	
	static int minCheck(String[] Array, int a, int b) {
		compareAccess = 0;
		compareAccess2 = 0;
		for(int i=a; i<a+8; i++) { 
			for (int n=b; n<b+8; n++) {
				if (Array[i].charAt(n) != compare1[i-a].charAt(n-b)) { // 글자단위로 끊어서 검사.
					compareAccess = compareAccess + 1;					// 문제가 있으면 갈아야 함
				}
				if (Array[i].charAt(n) != compare2[i-a].charAt(n-b)) {
					compareAccess2 = compareAccess2 +1;
				}
			}
		}
		if (compareAccess < compareAccess2) {
			return compareAccess; // 작은값이 더 최소값이니 작은값 내보냄.   
		}
		
		else {
			return compareAccess2;
		}
		
		
	}
	
	
}