import java.util.Scanner;

public class Main {
	

static	int N = 0;
static	int M = 0;
static int[] Array;
static boolean[] 다녀감;

public static void main(String[] args) {
	


	Scanner scan = new Scanner(System.in);
	N = scan.nextInt();
	M = scan.nextInt();
	scan.close();
	다녀감 = new boolean[N+1];  // N+1 만큼의 크기를 확인해야함. // 총 ~N까지의 구간+1
	Array = new int[M+1]; // 배열 
	
	깊이탐색(0);
	
	
}



static void 깊이탐색(int index) { // index는 Depth로 정의 
	
	if( index == M ) { //초기 입력받은 패러미터 0: 0 일치시,
		for(int i =0; i<M; i++) {
			
			System.out.print(Array[i] + " "); //Array 요소를 입력함., 이후 Array에 가산 혹은 참조로 Array이동
			} // 처음은  "0번인덱스"+" " 이 될 것임, // M 개 만큼 한 줄에 입력해야 하니, "M1" +" " +"M2" 구조를 띄고 있음.
		System.out.println(); //M을 나열하면 줄 넘김
		return;
	}
	for ( int i = 1; i<=N; i++) { // N까지 재귀하여 위 처리과정을 반복할 생각임
		if (!다녀감[i]) { // 그러기 위해서, 내가 이 노드를 방문했는지에 대한 정보 체크
			다녀감[i] = true;  // i 에 대해 다녀가지 않았을경우, 다녀갔다 처리.
			Array[index] = i; // 배열 Array의 현재 index에 받은 수 i를 넣어줌.
			깊이탐색(index+1); // 재귀, 다음 인덱스+1을 넘겨줌
			다녀감[i] = false; // 이전 i는 false 상태가 되어야 전단계로 돌아갈 수 있음.
			
		}
		
	}
	
}


}