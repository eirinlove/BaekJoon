import java.util.Scanner;

class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int[] Array = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	
	String b = scan.next();
	int c = b.length();

	for(int i=0; i<c; i++)
	{
	
	switch(String.valueOf(b.charAt(i))) {
	
	case "a":
		Array[0]++;
		break;
	case "b":
		Array[1]++;
		break;
	case "c":
		Array[2]++;
		break;
	case "d":
		Array[3]++;
		break;
	case "e":
		Array[4]++;
		break;
	case "f":
		Array[5]++;
		break;
	case "g":
		Array[6]++;
		break;
	case "h":
		Array[7]++;
		break;
	case "i":
		Array[8]++;
		break;
	case "j":
		Array[9]++;
		break;
	case "k":
		Array[10]++;
		break;
	case "l":
		Array[11]++;
		break;
	case "m":
		Array[12]++;
		break;
	case "n":
		Array[13]++;
		break;
	case "o":
		Array[14]++;
		break;
	case "p":
		Array[15]++;
		break;
	case "q":
		Array[16]++;
		break;
	case "r":
		Array[17]++;
		break;
	case "s":
		Array[18]++;
		break;
	case "t":
		Array[19]++;
		break;
	case "u":
		Array[20]++;
		break;
	case "v":
		Array[21]++;
		break;
	case "w":
		Array[22]++;
		break;
	case "x":
		Array[23]++;
		break;
	case "y":
		Array[24]++;
		break;
	case "z":
		Array[25]++;
		break;
		
		
	}
	}
	
	
	for(int i = 0;  i<Array.length; i++) {
		
		if( i != Array.length ) {
		System.out.print(Array[i]+" ");}
		
		else {System.out.println(Array[i]);}
	}
	
	
	}
}