import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws NumberFormatException, IOException {
	
	BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	
	int count  = Integer.parseInt(bf.readLine());
	int[][] Array = new int[count][2]; // [배열수][원소수]
	for (int i=0; i<count; i++) {
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		Array[i][0] = Integer.parseInt(st.nextToken());
		Array[i][1] = Integer.parseInt(st.nextToken());
		
	}
	

	
	Arrays.sort(Array, new Comparator<int[]>() { // Comparator 인터페이스 구현

		@Override
		public int compare(int[] o1, int[] o2) {  //compare 오버라이드 해서 배열 정렬.
			if(o1[0]==o2[0])
			// TODO Auto-generated method stub
			return o1[1]-o2[1];
			else {
				return o1[0]-o2[0];
			}
			
		}
		
	});
	
	for(int i=0; i<count; i++) {
		bw.write(Array[i][0]+" "+Array[i][1]+"\n");
		bw.flush();
		
	}
	
	
	
	
}
}