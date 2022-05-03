import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
	boolean[] chkpoint = new boolean[100000000];
	Arrays.fill(chkpoint, false); //chkpoint false로 초기화.
	int numChk = 0;
	
	
	for (int num=1; num<=10000; num++) {
		
		
	//맨 먼저 1검사 한다고 했을때	각각의 자리수 체크
		//int n = num;
		int n = num;
		while (n > 0 ) {
			
			numChk += n % 10;
			n /= 10;
				
		}
		numChk += num;
		//System.out.println(numChk);
		chkpoint[numChk] = true;
		numChk = 0;
		
	}
	
	
	selfNumChk(chkpoint);
	

	
	}
	
	
	static void selfNumChk(boolean[] chkpoint) {
		
	for (int num=1; num<=10000; num++ ) {
		
		if (chkpoint[num] == false) {
			
			System.out.println(num);
		}
		
	}
		
	
	}
	
}