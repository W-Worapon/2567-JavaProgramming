import javax.swing.JOptionPane;
import java.text.*;
 
public class Lab203 {
 
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("####.0");
		
		String strWeight = JOptionPane.showInputDialog(null,"Input Weight:","Input",JOptionPane.QUESTION_MESSAGE);
		double weight = Double.parseDouble(strWeight);
		
		String strHeight = JOptionPane.showInputDialog(null,"Input Height:","Input",JOptionPane.QUESTION_MESSAGE);
		double height = Double.parseDouble(strHeight);
		double realHeight = height / 100;
		
		
		
		double bmi = weight / (realHeight * realHeight);
		
		if(bmi < 18.5) {
			JOptionPane.showMessageDialog(null,"BMI = "+frm.format(bmi)+"\nYou're Under-weight","BMI",JOptionPane.WARNING_MESSAGE);
		}else if(bmi >= 18.5 && bmi <= 24.9){
			JOptionPane.showMessageDialog(null,"BMI = "+frm.format(bmi)+"\nYou're Normal-weight","BMI",JOptionPane.WARNING_MESSAGE);
			
			
		}else if (bmi >= 25.0 && bmi <= 29.9) {
			
			JOptionPane.showMessageDialog(null,"BMI = "+frm.format(bmi)+"\nYou're Over-weight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else{
			JOptionPane.showMessageDialog(null,"BMI = "+frm.format(bmi)+"\nYou're Obesity","BMI",JOptionPane.WARNING_MESSAGE);
		}
	}
 
}