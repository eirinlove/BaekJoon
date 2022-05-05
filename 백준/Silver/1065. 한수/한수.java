import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int length = 0;
		int sprint = 0;
		int count = 0;
		int[] Array = new int[4];
		int[] fill = new int[4];
		
		int set = scan.nextInt();
		
		
		if (set <= 99) {
		
		count = set;
		}
		
		else { 
			
		count += 99;
		for (int num=100; num<=set; num++) {
			
			length = (int)(Math.log10(num)+1); 
			Array = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
		// 배열로 저장하는 단계	
	
		
		for (int i=0; i<=length-2; i++) {
			
		fill[i] = Math.abs(Array[i])-Math.abs(Array[i+1]);
		

		}
		for (int i=0; i<=length-3; i++) {
			
		if (fill[i] != fill[i+1]) {
			
		sprint += 1;
		}
		
		//검사는 맨 마지막, 첫번째 과제는 어떻게 돌려서 - 시킬까임
		}
		
		if (sprint == 0 ) {
			
			count +=1;
		}
		Arrays.fill(fill, 0);
		Arrays.fill(Array, 0);
		sprint = 0;
		length = 0;
		
		}
		
		}
		System.out.println(count);
	}
}