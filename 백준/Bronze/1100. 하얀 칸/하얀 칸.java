import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		boolean sw = true;
		boolean zzak = true; // true = 홀수 상태 false = 짝수 상태
		String[] chess = new String[8];
		int count = 0;
		for (int i =0; i<8; i++){
			
			chess[i] = scan.next();
			
		}
		
		
		for(int i=0; i<8; i++) {
			
			for(int j=0; j<8; j++) {
				
				
				if(sw==true) {
					
					if(chess[i].charAt(j)=='F' && zzak) { // 짝수상태 = 하얀칸
						
						count++;
						
					}
					
				}
				else if (sw==false) {
					
					if(chess[i].charAt(j)=='F' && !zzak) {
						
						count++;
					}
					
					
				}
				
				zzak = !zzak;
			}
			if(sw) {sw=false;}
			if(!sw) {sw=true;}
			zzak = !zzak;
			
			
		}
		
		System.out.println(count);
		
		
		
		
	}
	
}