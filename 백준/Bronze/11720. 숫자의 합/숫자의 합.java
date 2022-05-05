import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int exam = scan.nextInt();
		String num = scan.next(); // int 최대자리수가 넘어가기 때문에 String -> int 전환 각배열로 옮겨야함
		int sum = 0;
		int[] Array = new int[exam];
		Array = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray(); 
		for (int i=0; i<exam; i++) {
			
			sum+= Array[i];
		}
		System.out.println(sum);
		

	}

	
}