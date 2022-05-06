import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	String spell = scan.next();
	String[] Array = new String[spell.length()];
	Array = spell.split("");
	int count =0;
	scan.close();
	for (int num=0; num<Array.length; num++) {
		
		switch(Array[num]) {
		
		case "A":
		case "B":
		case "C":
			count+=3;
			break;
		case "D":
		case "E":
		case "F":
			count+=4;
			break;
		case "G":
		case "H":
		case "I":
			count+=5;
			break;
		case "J":
		case "K":
		case "L":
			count+=6;
			break;
		case "M":
		case "N":
		case "O":
			count+=7;
			break;
		case "P":
		case "Q":
		case "R":
		case "S":
			count+=8;
			break;
		case "T":
		case "U":
		case "V":
			count+=9;
			break;
		case "W":
		case "X":
		case "Y":
		case "Z":
			count+=10;
			break;
		
		
		}
		
		
		
	}
	
	System.out.println(count);
	/* case 문으로 각 알파벳에 대응되는 count를 늘리도록 하였음.*/
}
}