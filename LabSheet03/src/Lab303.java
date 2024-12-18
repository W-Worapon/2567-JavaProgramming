import java.util.*;
 
public class Lab303 {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int countWord=0;
		int countSpace=0;
		
		System.out.print("Input a sentence :  ");
		String sentence = input.nextLine();
		
		while(sentence.endsWith("") || sentence.endsWith(" ")) {
			if(sentence.endsWith(".")) {
				break;
			}
			System.out.print("Input a sentence, again : ");
			sentence = input.nextLine();
		}//end of while
		
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i) ==' ') {
				countSpace++;
			}
		}
		countWord = countSpace +1;
		
		System.out.println("");
		System.out.println("This sentence has "+countSpace+" spacebar.");
		System.out.println("This sentence has "+countWord+" word.");
		input.close();
	}
 
}