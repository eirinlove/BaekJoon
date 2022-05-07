import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] Array = new int[num];
		int count =0;
	
		for(int i=0; i< Array.length; i++) {
			
			Array[i] = scan.nextInt();
			
		}
		
		
		
		for(int i=0; i< Array.length; i++) {
			
			
			switch(Array[i]) {
			
			case 2:
			case 3:
			case 5:
			case 7:
			case 11:
			case 13:
			case 17:
			case 19:
			case 23:
			case 29:
			case 31:
			case 37:
			case 41:
			case 43:
			case 47:
			case 53:
			case 59:
			case 61:
			case 67:
			case 71:
			case 73:
			case 79:
			case 83:
			case 89:
			case 97:
			case 101:
			case 103:
			case 107:
			case 109:
			case 113:
			case 127:
			case 131:
			case 137:
			case 139:
			case 149:
			case 151:
			case 157:
			case 163:
			case 167:
			case 173:
			case 179:
			case 181:
			case 191:
			case 193:
			case 197:
			case 199:
			case 211:
			case 223:
			case 227:
			case 229:
			case 233:
			case 239:
			case 241:
			case 251:
			case 257:
			case 263:
			case 269:
			case 271:
			case 277:
			case 281:
			case 283:
			case 293:
			case 307:
			case 311:
			case 313:
			case 317:
			case 331:
			case 337:
			case 347:
			case 349:
			case 353:
			case 359:
			case 367:
			case 373:
			case 379:
			case 383:
			case 389:
			case 397:
			case 401:
			case 409:
			case 419:
			case 421:
			case 431:
			case 433:
			case 439:
			case 443:
			case 449:
			case 457:
			case 461:
			case 463:
			case 467:
			case 479:
			case 487:
			case 491:
			case 499:
			case 503:
			case 509:
			case 521:
			case 523:
			case 541:
			case 547:
			case 557:
			case 563:
			case 569:
			case 571:
			case 577:
			case 587:
			case 593:
			case 599:
			case 601:
			case 607:
			case 613:
			case 617:
			case 619:
			case 631:
			case 641:
			case 643:
			case 647:
			case 653:
			case 659:
			case 661:
			case 673:
			case 677:
			case 683:
			case 691:
			case 701:
			case 709:
			case 719:
			case 727:
			case 733:
			case 739:
			case 743:
			case 751:
			case 757:
			case 761:
			case 769:
			case 773:
			case 787:
			case 797:
			case 809:
			case 811:
			case 821:
			case 823:
			case 827:
			case 829:
			case 839:
			case 853: 
			case 857:
			case 859:
			case 863:
			case 877:
			case 881:
			case 883:
			case 887:
			case 907:
			case 911:
			case 919:
			case 929:
			case 937:
			case 941:
			case 947:
			case 953:
			case 967:
			case 971:
			case 977:
			case 983:
			case 991:
			case 997:
			
				count++;
				default:
				break;
			
			}
			
			
		}
		
		System.out.println(count);
		
				
}
}