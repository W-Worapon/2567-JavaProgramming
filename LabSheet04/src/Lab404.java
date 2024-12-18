import java.util.*;

public class Lab404 {
	public static void main(String[] args) {
		inputStudent();

	}

	public static void inputStudent() {
		Scanner input = new Scanner(System.in);
		String studentId, subjectId;
		boolean isStudentIDValid, isSubjectCodeValid;
		
		while(true) {
			System.out.print("Enter Student Id: ");
			studentId = input.nextLine();
			
			System.out.print("Enter Subject Id: ");
			subjectId = input.nextLine();
			
			isStudentIDValid = isLength(studentId, 10);
			isSubjectCodeValid = isLength(subjectId, 7);
			
			if(isStudentIDValid && isSubjectCodeValid) {
				boolean isITStudent = isITStudent(studentId);
				boolean isITSubject = isITSubject(subjectId);
				
				System.out.println("");
				System.out.print("Student Id: "+studentId);
				displayData(isITStudent,isITSubject);
				break;
			
			}
		}
		input.close();
		
	}
	
	public static boolean isLength(String input,int len) {
		
		return input.length() ==len;
	}
	
	public static boolean isITStudent(String StudentIDcheck) {
		if(StudentIDcheck.substring(0,6) == "211311") {
			return true;
		}else {
			return false;
		}
		
		
	}
	public static boolean isITSubject(String subjectcheck) {
		if(subjectcheck.substring(0,2) =="21"&& subjectcheck.charAt(4) =='1') {
			return true;
		}else {
			return false;
		}
		
	}
	public static void displayData(boolean isstuent,boolean issubject) {
		if(isstuent) {
			System.out.print(" 1st year student in IT\n");
		}
		else{
			System.out.print(" is not 1st year student in \n");
		}
		if(issubject) {
			System.out.print("Enroll in courses for year 1");
		}
		else {
			System.out.print("Not Enroll in courses for year 1");
		}
	}
}
