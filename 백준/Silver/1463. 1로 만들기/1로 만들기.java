import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		// 반복문 사용 DP
		
		int num = scan.nextInt();
		int load[] = new int[num+1];  //x+1만큼 초기화
		load[0] = load[1] = 0;
		/* load 배열 */
		
		for( int i=2; i <= num; i++) {
			// x가 i보다 큰 2부터 시작해야하는 값임
			
			//load[i] = load[i/2] + 1; // i-1을 먼저 해줘도 상관없음, DP 말고 일반 while 문 사용했을때, -1 후 분기처리 하는 것을 평문으로 방지 한 것.
			load[i] = load[i-1]+1;
			//어찌됐든 load[i] 번째는  0.. 1... 2.... 와 같은 점화식으로 흐름
			if(i%2 ==0) {
				load[i] = Math.min(load[i], load[i/2]+1);
				
			}
			
			
			if (i%3 ==0) {
				
				load[i] = Math.min(load[i], load[i/3]+1);
			}
			
			/* 2와 3이 나눠지는 두 경우의 수에 */
			/* i 번째 수는 결국 끝 번째 시행인 x에 다다름*/
			/* 식이 흐르다가 load[i/x]+1 번의 끝 계수에 도달하게 됨,*/
			/* 그리고 load[i] = load[x] 가 되므로, */
			
			
		}
		
		System.out.println(load[num]);
		
	}
}

