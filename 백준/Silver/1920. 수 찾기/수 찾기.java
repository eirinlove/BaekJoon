import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> answerArray = new ArrayList<Integer>(); 
		int n1 = scan.nextInt();
		int[] Array1 = new int[n1];
		
		for (int i=0; i<Array1.length; i++) {
			
			Array1[i] = scan.nextInt();
			
		}
		
		int n2 = scan.nextInt();
		Integer[] Array2 = new Integer[n2];
		for (int i=0; i<Array2.length; i++) {
			
			Array2[i] = scan.nextInt();
			
		}
		Arrays.sort(Array1);
		
		
		// 이분탐색 사용
		for (int i=0; i<Array2.length; i++) {
			
			int low=0;// 좌측끝
			int high=(Array1.length-1); // 우측끝, 내림차순 정렬이 되어있기(sort) 때문에 양갈래로 나눌 수 있음.
		
			
			while(low<=high) {
	
				int mid = (low + high) / 2 ; // 중간번째 획득
				
				if(Array2[i] == Array1[mid]) { //비교대상의 중간번째와 i가 같은가? // 네. 일치
					answerArray.add(1);
					break;
				}
				else if (Array2[i] < Array1[mid]) { //비교대상이 더 큼,  high의 위치를 -1함.
					
					high = mid -1;
				}
				else if (Array2[i] > Array1[mid]) { // mid쪽이 더 작음, low의 위치를 +1함.
					low = mid +1;
				}
				
				if(low>high) {
					answerArray.add(0);
					break;
					
				}

					
				}
				
			
			}
		
		//Collections.reverse(answerArray);
		for(int i=0; i<answerArray.size(); i++) {
			
			System.out.println(answerArray.get(i));
		}
		
		
		
		}
		
		
		
	}