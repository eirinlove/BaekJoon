import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int ObjectCHN = scan.nextInt();
		int brokenNum = scan.nextInt();
		int countHund = Math.abs(100-ObjectCHN);
		int[] brokenArray = new int[brokenNum];
		int niceObject = 0;
		int count = 0;
		boolean hund = false;
		for(int i=0; i<brokenArray.length; i++) {
			
			brokenArray[i] = scan.nextInt();
		}
		scan.close();
		
		if(brokenArray.length==0) {
			
			niceObject = (int)Math.log10(ObjectCHN)+1;
		}
		
		niceObject = explorer(brokenArray, ObjectCHN);
		
		// 여기서 받은 수를 채널과 비교하여, 채널 쪽까지 +혹은 - 그리고 카운트함.,  Length 도 카운트.
		
		if(countHund < niceObject) {
			
			System.out.println(countHund);
		}
		
		else {System.out.println(niceObject); }
		
		
		
		//반복문을 통해 1234보다 높은 수 혹은 낮은 수를 탐색하여야 한다.
		//탐색하기 위해, 배열화된 지정채널과 고장난 버튼을 메서드에서 사용하여야 한다.
		
			
		//System.out.println(numberEX.length);
		
		
	}
		
		
	
	static int explorer(int[] b, int c) {
		
		String data="";
		int south = 0;
		int chan = 1000000;

		
//		if (c==1) {
//			for(int i=0; i<b.length; i++) {data+=Integer.toString(b[i]); }
//			if(c==1 && data.contains("1") && data.contains("2") && data.contains("3") && data.contains("4") && data.contains("5") && data.contains("6") && data.contains("7") && data.contains("8") && data.contains("9")) {
//				
//			return 0;	
//			}
//			
//		}
		
		
		for(int i=0; i<=1000000; i++) {
			
			data = Integer.toString(i); // int 스트링화
			boolean sw = true;
			
			for (int j=0; j<b.length; j++) {
					
				if(data.contains(Integer.toString(b[j]))) {//고장난 문자의길이만큼, 고장난 버튼이 있는지 탐색한다.
					sw = false; // 고장난게 있으면 넣지 않음.
					break;
				}
				
			}
			if (sw==false)continue;
			
			
			south = data.length()+Math.abs(i-c);
			if( south < chan) {chan=south;}
			
			
		}
		
		
		
		return chan;

		
	}
}