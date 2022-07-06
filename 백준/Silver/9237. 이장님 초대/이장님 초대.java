import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	Integer[] Array = new Integer[n];
	
	for(int i =0; i<n; i++){
		
		Array[i] = scan.nextInt();
		
	}
	
	Arrays.sort(Array, Collections.reverseOrder());
	
	int sum = 0;

	
	for(int i=0; i<n; i++){
		/* 4+0+1, 3+1+1, 3+2+1, 2+3+1 맨앞은 묘목 자라는데 걸리는 기간, 맨뒤의 1은 묘목심는데 걸리는 기간, 가운데는 다른거 심느라 기다린 기간*/
		Array[i]=Array[i]+i+1; 
		if(Array[i]>sum){// 1회차, 5를 합함, 2회차는 5=5 패스,  3회차 1을 합함, 4회차 패스  
			
			sum = Array[i];
		}
		
		
	}
	System.out.println(sum+1);
	
	//즉, 묘목 성장기간, 심는데 걸리는기간, 다른 묘목이 기다리는 기간으로 분리하여 정리

	
	

}
}