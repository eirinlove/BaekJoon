import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int[] number = new int[2];
		int[] Array = new int[3];
		int[] Array2 = new int[3];
		int[] ArrayDo = new int[3];
		int[] ArrayDo2 = new int[3];
		int Arch =0;
		int Arch2 =0;
		
		for(int num=0; num<number.length; num++) {
			
			number[num] = scan.nextInt();
		
			if (num==0) {
			Array = Stream.of(String.valueOf(number[num]).split("")).mapToInt(Integer::parseInt).toArray();
			}
			else if (num==1) {
			ArrayDo = Stream.of(String.valueOf(number[num]).split("")).mapToInt(Integer::parseInt).toArray();	
			}
		}
		
		int count=0;
		for (int num=2; num>=0; num--) {
	
			
			Array2[count] = Array[num];
			ArrayDo2[count] = ArrayDo[num];
			count++;
		}
		//System.out.println(Array2[0]+" "+Array2[1]+" "+Array2[2]);
		
		Arch = Integer.parseInt(String.valueOf(Array2[0])+String.valueOf(Array2[1])+String.valueOf(Array2[2]));
		Arch2 = Integer.parseInt(String.valueOf(ArrayDo2[0])+String.valueOf(ArrayDo2[1])+String.valueOf(ArrayDo2[2]));
		
		if(Arch > Arch2) {
			
			System.out.println(Arch);
		}
		else {
			
			System.out.println(Arch2);
		}
		
		
	}
}