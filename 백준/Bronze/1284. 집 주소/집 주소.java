import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	while(true){
	int temp = 1;
	
	String str = scan.next();
	
	if(str.length() == 1 && str.charAt(0) == '0'){
		break;
	}
	
	for(int i=0; i<str.length(); i++){
		
		if(str.charAt(i) == '1') temp += 2;
		else if(str.charAt(i) == '2') temp += 3;	
		else if(str.charAt(i) == '0') temp += 4;
		else {temp += 3;}
		
		temp++;
		

	}
	System.out.println(temp);
	}
}
}