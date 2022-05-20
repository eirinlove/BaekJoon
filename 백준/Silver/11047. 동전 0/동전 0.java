import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int num = scan.nextInt();
	int money = scan.nextInt();
	int[] moneyList = new int[num];
	int temp = 0;
	int io=moneyList.length-1;
	int count =0;
	for(int i=0; i<num; i++) {
		
		moneyList[i] = scan.nextInt();
		
	}
	
	while (temp != money) {
		
		
		while(true) {
			
			if(temp + moneyList[io]<=money ) {
			temp += moneyList[io];
			count++;
			
			break;
			}
			else { io--; break;}
			
			
		}
		
		
	}
	System.out.println(count);
	
	
	
}
}