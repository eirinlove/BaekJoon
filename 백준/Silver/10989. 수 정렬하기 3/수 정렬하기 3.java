import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
public static void main(String[] args) throws NumberFormatException, IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	int a = Integer.parseInt(br.readLine());
	int[] Array = new int[a];
	
	for(int i=0; i<a; i++) {
		
		Array[i] = Integer.parseInt(br.readLine());
	}
	
	
	Arrays.sort(Array); // 정렬 
	
	for(int i=0; i<Array.length; i++) {
		
		bw.write(Array[i]+"\n");
	}
	bw.flush();
	bw.close();
	
	
	
}
}