import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) throws IOException {
		
		
		Scanner scan = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = scan.nextInt();
		ArrayList<Integer> Array = new ArrayList<>();
		
		
		
		for (int i=0; i<n; i++) {
			
			int num = scan.nextInt();
			Array.add(num);
			
		}
		
		Collections.sort(Array);
		
		for (int i=0; i<Array.size(); i++) {
			
			bw.write(Array.get(i)+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}