import java.util.*;
import java.text.DecimalFormat;
public class Lab504 {
    public static void main(String[] args) {
        //var
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner input = new Scanner(System.in);
        double[] studentScore = new double[5];
        double totalStudentScore =0;
        double averageScore = 0;
 
        for (int i = 0;i<studentScore.length;i++) {
            System.out.print("Input score of student "+(i+1)+
            " : ");
            studentScore[i] = input.nextDouble();
            totalStudentScore += studentScore[i];
        }
 
        System.out.println();
        averageScore = totalStudentScore / studentScore.length;
 
                   
        System.out.println("Average of "
        +studentScore.length
        + " student is " + df.format(averageScore));
       
        for (int i = 0 ; i<studentScore.length;i++) {
            if (studentScore[i] > averageScore) {
                System.out.println("> Student "+(i+1)+" (" + df.format(studentScore[i])+")");
            }
        }
        
        input.close();
 
    }
}