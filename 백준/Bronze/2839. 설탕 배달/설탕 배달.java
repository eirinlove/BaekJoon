import java.util.Scanner;



public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		int i = scan.nextInt();
		scan.close();
		int count=0;
		
		
for (int num=0;;num++) {		
		
	if (i%5 == 0 ) {
		count += i / 5;
		System.out.println(count);
		
		break;}
		
	else {
			
			 i = i-3;
			 count+=1;
			// 전역변수 i를 다시 반복문에 넣고 돌림
			// / 가 아니라 -를 하는 이유는, i에대해 3을 최소로 쓰기 위함
			// 22의 경우, 5 5 3 3 3 3 으로 분해되는데, 여기서 3만을 제거한다고 하면
			// 4번 순회후 첫번째 조건문을 만나게 됨.
		}
		if( i<0 ) {
			System.out.println("-1");
			break;
		}
		
	}
}		
		

	
		
		
		
	}