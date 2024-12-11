import javax.swing.JOptionPane;

public class Lab302_1 {

	public static void main(String[] args) {

	    boolean vaildEmail = false;
	    String inputEmail;
		
	    while(true) { 
			inputEmail = JOptionPane.showInputDialog("Input your e-mail:").toLowerCase();
			while(inputEmail.startsWith("@") || inputEmail.contains(" ")) {
				inputEmail = JOptionPane.showInputDialog("Input your e-mail,again:").toLowerCase();
			}
			
			vaildEmail = inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail");
			if(vaildEmail) {
				JOptionPane.showMessageDialog(null, "Your e-mail is "+ inputEmail);
				break;
				
			}else {
				JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
				continue;
			}
	  }	
   }
}