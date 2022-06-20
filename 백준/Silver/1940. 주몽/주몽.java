import java.util.Arrays;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] data = new int[N];
		int result =0;
		
		
		for(int i =0; i<N; i++) {
			data[i] = scan.nextInt();
		}
		
		Arrays.sort(data);
		// 정렬 //
		

		int start = 0;
		int end = data.length-1;
		
		
		while (start < end ) {
			
			if(data[start] + data[end] == M ) { // 1번 포인터와 2번 포인터의 합이 M일때
				
				
				end--;
				start++;   // start와 end 위치 옮김, 갑옷 하나 만듬,
				result++;
				
			}
		
			else if (data[start] + data[end] > M){
				
				// end + start 값이 필요량보다 클 때
				end--; // End 끌어옴
			}
			else { start++;} // 아니면 start 끌고감 // 가운데 수렴함.
		}
		
		// 두 포인터를 양끝에 두고 좁혀가는 방식, 누적합 취하지 않음.
		
		
		
		
		System.out.println(result);
		
		
		
		
		
		
		
		
//		for(int start =0; start<N; start++) {
//		
//		while(summary < M && end < N) {
//			
//			summary += data[end];
//			end++;
//			
//		}
//		
//		if( summary == M ) {
//			
//			result++;
//		}
//		
//		summary -= data[start];
//		
//		
//	
//	} 포인터 간격을 +1로 맞추어서 end가 start의 +1이 되는 방식, [누적합을 취함]
		
		
		
	}
}