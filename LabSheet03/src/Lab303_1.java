import javax.swing.*;
 
public class Lab303_1 {
 
	public static void main(String[] args) {
		
		int countWord=0;
		int countSpace=0;
		
		String sentence = JOptionPane.showInputDialog(null,"Input a sentence:");
		while(sentence.endsWith("") || sentence.endsWith(" ")) {
			if(sentence.endsWith(".")) {
				break;
			}
			sentence = JOptionPane.showInputDialog(null,"Input a sentence, again:");
		}//end of while
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i) ==' ') {
				countSpace++;
			}
		}
		countWord = countSpace +1;
		
		JOptionPane.showMessageDialog(null, "This sentence has "+countSpace+" spacebar."
				+"\nThis sentence has "+countWord+" word.");
	}
 
}