import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int[] panel = {1,1,1,1,1,1,2,1,1,1};
		
		
		String num = scan.next();
		num = num.replace("9", "6");// 9는 6이랑 동일 취급함.
		int cha = 0;
		int count = 1;
		
		
		
		for(int i=0; i<num.length(); i++) {
			
			cha = i;
			 
			if(panel[Character.getNumericValue(num.charAt(cha))] >= 1) { // 현재 번호에 해당하는 아이템이 1개 이상 있을경우
											// 해당 아이템의 수를 -함
				panel[Character.getNumericValue(num.charAt(cha))]--;
				
			}
			else if (panel[Character.getNumericValue(num.charAt(cha))] == 0) { // 현재 번호에 해당하는 아이템이 없을 경우
				
				for(int j=0; j<panel.length; j++) { panel[j]++; }
				panel[6]++; // 6번은 9번처럼 쓸 수 있으니 하나 더
				panel[Character.getNumericValue(num.charAt(cha))]--;
				count++;	
			}
		}
		
		System.out.println(count);
	}
}