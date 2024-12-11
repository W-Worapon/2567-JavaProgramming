import java.util.*;

public class Lab303 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = input.nextLine();
		
		int words = 0;
		int countspacebar =0;
		
		while(true){
			if(sentence.endsWith(".")) {
				break;
			}else {
				System.out.print("Input a sentence, again : ");
				sentence = input.nextLine();
			}
		}
		
		for(int i=0;i<sentence.length();i++) {
			if(sentence != " ") {
				words++;
			if(sentence != "") {
				countspacebar++;
			}
		}
		
		
			System.out.println("This sentence has "+words+" word.");
			System.out.print("This sentence has "+countspacebar+" word.");
		
	    }
		input.close();
	}
}
