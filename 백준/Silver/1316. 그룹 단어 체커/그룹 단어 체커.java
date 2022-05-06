import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int countNum = 0;
		
		
		int example = scan.nextInt();
		
		for (int i=0; i<example; i++) {
		
		String str = scan.next();
		String[] Array = new String[str.length()+1];
		Array = str.split("");

		boolean status = true;
		
		for (int num=0; num<Array.length; num++) {
			
			status = true;
						
				for (int y=num; y<Array.length; y++) {
					
			 		if (Array[num].startsWith(Array[y])&& status ==true) {
					
//			 			System.out.println("아이고난");
					}
			 		else if (!Array[num].startsWith(Array[y])) {
						
//						System.out.println("이제 기회없음");
						status = false;
					}
			 		
					if (Array[num].startsWith(Array[y]) && status==false) {
						
						count++;
						break;
					}
					
					
				}
				
	
		}
		if ( count == 0 ) {
			
			countNum++;
		}
		count=0;
		
		}
		System.out.println(countNum);
	}
}