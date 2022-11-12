import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Muhammad Eril Fario
//Nomor 2

public class Main {
	Scanner sc = new Scanner(System.in);
	public Main() {		
//		String sentence = "Berikut adalah kisah sang gajah. Sang gajah memiliki teman serigala bernama DoeSang. Gajah sering dibela oleh serigala ketika harimau mendekati gajah.";
		String sentence,input;
		String keyword1 = "serigala";
		String keyword2 = "harimau";
		String keyword3 = "sang gajah";
		
		System.out.print("Input: ");
		input = sc.nextLine();
		
		sentence = input;
		sentence = sentence.replace(".", "");
		sentence = sentence.toLowerCase();
		
//		System.out.println("Inputted Sentence: " + sentence);
		
		int serigala = findWordsinSentence(sentence, keyword1);
		int harimau = findWordsinSentence(sentence, keyword2);
		int sangGajah = findWordsinSentence(sentence, keyword3);
		
		Print(sangGajah,serigala,harimau);		

	}

	private void Print(int sangGajah, int serigala, int harimau) {

		for(int i =0;i<sangGajah;i++) {
			System.out.print("sang gajah - ");
		}
		for(int i =0;i<serigala;i++) {
			System.out.print("serigala - ");
		}
		for(int i =0;i<harimau;i++) {
			System.out.println("harimau ");
		}
		
	}

	private int findWordsinSentence(String sentence, String keyword) {
		
	    String a[] = sentence.split(" ");
	    int count = 0;
	    
	    if(keyword.equalsIgnoreCase("sang gajah")) {

	    	int sang = findWordsinSentence(sentence, "sang");
	    	int gajah = findWordsinSentence(sentence, "gajah");
	    	
	    	if(gajah>sang) {
	    		count = sang;
	    	}else if(sang > gajah) {
	    		count = gajah;
	    	}
	    	
	    	
	    }else {
	    	for (int i = 0; i < a.length; i++){
	    		if (keyword.equals(a[i]))
	    			count++;
	    	}	    	
	    }
	    
	 
	    return count;
		
	}

	public static void main(String[] args) {

		new Main();

	}

}
