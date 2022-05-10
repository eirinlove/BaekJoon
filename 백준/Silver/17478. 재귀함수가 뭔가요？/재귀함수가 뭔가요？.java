import java.util.Scanner;

public class Main {

	
	static String text1 ="\"재귀함수가 뭔가요?\"";
	static String text2 ="\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
	static String text2_1 ="마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
	static String text2_2 ="그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
	static String text3 ="\"재귀함수는 자기 자신을 호출하는 함수라네\"";
	static String text4 ="라고 답변하였지.";
	static String under ="____";
	static int y =0;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		scan.close();
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text2_1);
		System.out.println(text2_2);
		if (i>=1) {
		System.out.println(loop(i-1));
		}
	}
	
	
	static String loop(int a) {
		
		
		y++;
		System.out.println(under.repeat(y)+text1);
		if(a==0) {
			
			System.out.println(under.repeat(y)+text3);
			while(y>=1) {
				System.out.println(under.repeat(y)+text4);
				y--;
				
				
			}
			
			return text4;
		}
		if(a>=1) {
			
			System.out.println(under.repeat(y)+text2);
			System.out.println(under.repeat(y)+text2_1);
			System.out.println(under.repeat(y)+text2_2);
			
		}
		
		
		//return under+loop(a-1);
		return loop(a-1);
	}
	// ____ 문자열을 2배 ~ 3배로 늘린다는건, 재귀 호출을 하면서 under을 수정하는 것도 방법임.
}