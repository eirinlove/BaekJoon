import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int[] moneyList = {1,5,10,50,100,500};
	
	int money2 = scan.nextInt();
	int money = 1000-money2;
	
	int temp=0;
	int io=moneyList.length-1;
	int count=0;
	
	
	while(temp != money) {
		
		
		while(true) {
			
			if(temp+moneyList[io] <=money) {
				
				temp+= moneyList[io];
				count++;
				break;
			}
			else {io--; break;}
			
			
			
		}
		
	}
	
	System.out.println(count);
	
	
}
}