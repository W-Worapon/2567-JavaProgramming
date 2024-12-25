import java.util.*;
 
public class Lab404
{
    public static void main(String[] args) {
        inputStudent();
 
    }
    public static void inputStudent()
	{
		Scanner scanner = new Scanner(System.in);
		String studentID,subjectCode;
		boolean isStudentIDValid, isSubjectCodeValid;
		while (true) {
			System.out.print("Enter student ID (10 digits) : ");
			studentID = scanner.nextLine();
 
			System.out.print("Enter subject code (7 digits) : ");
			subjectCode = scanner.nextLine();
 
			isStudentIDValid = isLength(studentID , 10);
			isSubjectCodeValid = isLength(subjectCode , 7);
 
			if (isStudentIDValid && isSubjectCodeValid) {
				boolean isITStudent = isITStudent(studentID);
				boolean isITSubject = isITSubject(subjectCode);
 
 
				System.out.print("\nStudent id: " + studentID + " ");
 
				displayData(isITStudent,isITSubject);
				break;
			}
			else {
				System.out.print("");
			}
		}
        scanner.close();
 
	}
 
	public static boolean isLength(String input,int length)
	{
 
		return input.length() == length;
	}
 
	public static boolean isITStudent(String ID) {
 
 
			if (ID.substring(0,6).equalsIgnoreCase("211311") ) {
				return true;
			}
 
 
 
		return false;
	}//End of isITStu
	public static boolean isITSubject(String Code) {
		if (Code.substring(0,2).equalsIgnoreCase("21") && Code.substring(4,5).equalsIgnoreCase("1") ) {
			return true;
		}
		return false;
	}//End of isITSub
 
	public static void displayData(boolean StuId,boolean SubC)
	{
		if (StuId == true) {
			System.out.print("1st year student in IT");
		}
		else {
			System.out.print("is not 1st year student in IT");
		}
		if (SubC == true) {
			System.out.print("\nEnroll in courses for Year 1");
		}
		else {
			System.out.print("\nnot enroll in courses for Year 1");
		}
 
 
	}
}