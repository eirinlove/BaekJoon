import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		while(scan.hasNextLine()) {
		
		String str = scan.nextLine();
		char[] array = str.toCharArray();
		for(int i=0; i<array.length; i++) {
		
			//String o = String.valueOf(str.charAt(i));
			String o = String.valueOf(array[i]);
			
			switch (o) {
			case "1":
				System.out.print("`");
				break;
			case "2":
				System.out.print("1");
				break;
			case "3":
				System.out.print("2");
				break;
			case "4":
				System.out.print("3");
				break;
			case "5":
				System.out.print("4");
				break;
			case "6":
				System.out.print("5");
				break;
			case "7":
				System.out.print("6");
				break;
			case "8":
				System.out.print("7");
				break;
			case "9":
				System.out.print("8");
				break;
			case "0":
				System.out.print("9");
				break;
			case "-":
				System.out.print("0");
				break;
			case "W":
				System.out.print("Q");
				break;
			case "E":
				System.out.print("W");
				break;
			case "R":
				System.out.print("E");
				break;
			case "T":
				System.out.print("R");
				break;
			case "Y":
				System.out.print("T");
				break;
			case "U":
				System.out.print("Y");
				break;
			case "I":
				System.out.print("U");
				break;
			case "O":
				System.out.print("I");
				break;
			case "P":
				System.out.print("O");
				break;
			case "[":
				System.out.print("P");
				break;
			case "S":
				System.out.print("A");
				break;
			case "D":
				System.out.print("S");
				break;
			case "F":
				System.out.print("D");
				break;
			case "G":
				System.out.print("F");
				break;
			case "H":
				System.out.print("G");
				break;
			case "J":
				System.out.print("H");
				break;
			case "K":
				System.out.print("J");
				break;
			case "L":
				System.out.print("K");
				break;
			case ";":
				System.out.print("L");
				break;
			case "X":
				System.out.print("Z");
				break;
			case "C":
				System.out.print("X");
				break;
			case "V":
				System.out.print("C");
				break;
			case "B":
				System.out.print("V");
				break;
			case "N":
				System.out.print("B");
				break;
			case "M":
				System.out.print("N");
				break;
			case ",":
				System.out.print("M");
				break;
			case " ":
				System.out.print(" ");
				break;
			case ".":
				System.out.print(",");
				break;
			case "/":
				System.out.print(".");
				break;
			case "'":
				System.out.print(";");
				break;
			case "]":
				System.out.print("[");
				break;
			case "=":
				System.out.print("-");
				break;
			case "\\":
				System.out.print("]");
				break;
				
				
			
			}
			
		}
		
		if(str.equals("")) {break;}
		
		System.out.println();
		}
		
				
				
	}
	
}