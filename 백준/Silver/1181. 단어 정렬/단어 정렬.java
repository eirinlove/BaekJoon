import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int wordNum = scan.nextInt();
	ArrayList<String> words = new ArrayList<String>();
	ArrayList<String> wordC = new ArrayList<String>();
	String[] word = new String[wordNum];
	
	for(int i = 0; i<wordNum; i++) {
		word[i] = scan.next();		
	}
	Arrays.sort(word);
	
	
	for(int i  =0; i<word.length; i++) {
		
		words.add(word[i]);  //사전 순 정렬.
	}
	

	Comparator<String> sorted = new Comparator<String>()
	
	{ public int compare(String s1, String s2) 
	{ 
	return Integer.compare(s1.length(), s2.length());
	
	} };

	Collections.sort(words, sorted);  // 글자순 정렬
	
	for(int i=0; i<words.size(); i++) {
		if(!wordC.contains(words.get(i)))   { // 포함하고 있지 않는것만 = 중복제거
			wordC.add(words.get(i));
		}
			
	}
	
	for(int i=0; i<wordC.size(); i++) {
		
		System.out.println(wordC.get(i));   // 중복이 제거된 상태로 나열
	}
	

}
}