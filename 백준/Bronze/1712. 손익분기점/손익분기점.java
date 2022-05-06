import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	
	int base = scan.nextInt();
	int cost = scan.nextInt();
	int consume = scan.nextInt();
	
	scan.close();
	
	if(cost >= consume) {
		System.out.println("-1");
	}
	else { System.out.println(base/(consume-cost)+1);
		
	} // 설비가/(소비가-원가)+1 
		// 소비가가 원가를 덮으므로, 소비가-원가 후, 설비가로 나누면 필요한 마지노선에 +1을 한다.

	
}
	
	
}

//--------- 실행시간이 너무 긺 -----------
//for (int num=1; ;num++) {
//	
//	if(base+(cost*num) < (consume*num)) {
//		
//		
//		System.out.println(num);
//		break;
//	}
//	
//	if (cost >= consume) {
//		System.out.println("-1");
//		break;
//	}
//	
//}