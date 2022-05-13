import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		
		
		for(int test=0; test<testCase; test++ ) {
			LinkedList<int[]> queue = new LinkedList<>();
			int count= 0;
			int queueSlot = scan.nextInt();
			int question = scan.nextInt();
		
		for(int i=0; i<queueSlot; i++) {
			
			queue.add(new int[] {i, scan.nextInt()});// ArrayList에 숫자 및 Priority 받음 
			//i는 수, 입력은 우선순위
		}
		
		

		
		
		while(!queue.isEmpty()) {
			
			int[] first = queue.poll(); // 첫번째 뽑아옴, for문을 직접 안쓰고, 매개를 받아서 쓰는이유는 아래 서술됨
			boolean sw = true;
			
			for(int i=0; i<queue.size(); i++) { // 순회 할때마다의 변경된 사이즈만큼 반복할 것임.
				
				 if (first[1]<queue.get(i)[1] ) { //탐색 대상이 우선순위가 더 낮은경우.
					queue.add(first);
					for(int queuePool=0; queuePool<i; queuePool++){
						queue.add(queue.poll()); // 큐를 뽑고, 큐 이전에 대기하고 있는 요소들도 큐에 올림
					}
					
					sw = false;
					break;
					
					
				}
				 


				
			}
			
			
			if(sw == false) {continue;} // 스위치 꺼지면 count++ 와 관계없이 반복문 처음으로 돌림.
			count++; // 스위치 안꺼지면 계수하고
			if(first[0] == question) {break;} // 도중, question과 맞으면 while문을 종료한다.
			
			
			
			
			
			
			
			/*아래와 같이 하면, index 문제가 남, queue를 poll하면, List의 크기가 줄어들기 때문에
			 * 다음 for문이 작동하면 없는 리스트 참조 오류로 문제가 생기는데, 이를 막으려고 pollLast를
			 * 첫번째로 다시 옮기게 되면, 동일 우선순위가 여러개 있는 경우, 우선순위가 낮은 원소가 
			 * 끝없이 밀리게 되는 현상이 발생함 */
			
//			if (queue.get(i)[1] > queue.get(j)[1]) {
//											 // 큐에 대기중인 수가 우선순위가 더 낮을 경우.
//				int[] ob = queue.pollLast(); // 현재 큐를 꺼내서 처음으로 넣는다.
//				queue.add(0, ob); 
//				//System.out.println(queue.get(i)[0]);
//				//count++; // 하나씩 처리하면서 count를 늘리고, question과 일치한것이 처리되면 count 제출?
//				
//			}// 이거 말고 우선순위가 같을 경우, 더 작은경우 도 처리 해야함.
//			
//			else if (queue.get(i)[1] < queue.get(j)[1] || queue.get(i)[1] == queue.get(j)[1]) {
//				
//				// 큐를 꺼내 삭제해야함.
//				queue.pollLast();
//				count++;
//			}
			


			
		}
			// 우선순위별로 큐에 넣어야 함.
			//만약 뒤로 보낸게 question 과 일치하면 count를 length 만큼 더하고
			
		System.out.println(count);	
		}
	}
	
		

		
	}


class queueInfo{
	
	int num;
	int priority;
	
		public queueInfo(int num, int priority) {
			
			this.num = num;
			this.priority = priority; // 생성자
		}
	
}