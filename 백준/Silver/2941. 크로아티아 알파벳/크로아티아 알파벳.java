import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String str = scan.next();
	String[] Array = new String[str.length()+4];
	Array = str.split("");
	str = "";
	int count=0;
	
	
	for(int num=0; num<Array.length; num++) { //마지막 이전글자까지 순회
		
		
		
		if (Array[num].startsWith("c") || Array[num].startsWith("d")  || Array[num].startsWith("l") || Array[num].startsWith("n") || Array[num].startsWith("s") || Array[num].startsWith("z")) {
			
		if ( num < Array.length-2 && Array[num].startsWith("d") && Array[num+1].startsWith("z") && Array[num+2].startsWith("=")) {
			
			num+=2; // 문자수 (3개) 만큼 다음 Read 순서를 미룸
			count++; 
		}
		
		else {//System.out.println("카운트="+count+"\n상황="+Array[num]+Array[num+1]);
			if(num < Array.length-1) {
			str = Array[num]+Array[num+1];}
			
			else { str = Array[num];}
			
			switch(str) {
			
			case "c=":
			case "c-":
			case "d-":
			case "lj":
			case "nj":
			case "s=":
			case "z=":
				count++;
				num++; //문자수 (2개) 만큼 다음 Read 순서를 미룸
				//str ="";
				break;
			default: count++; //nl, dd와 같은 두번째 이후 문자열 불일치
				break;
			
			}
		
			
		}
		
			
		}else { count++; }  // 문자열 불일치.
		
		
		
	}
	
	
System.out.println(count);	
}
}