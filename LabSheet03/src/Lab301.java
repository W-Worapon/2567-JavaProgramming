import java.util.*;

public class Lab301 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		//กำหนดตัวแปรชื่อ text ไว้รวมข้อความเข้าด้วยกัน
		String txtConcate = "";
		//กำหนดตัวแปรชื่อ word ไว้สำหรับรับข้อความ console
		String word;
		while(true) {
			System.out.print("Enter word: ");
			word = kb.next();
			//ตัวตรวจเงื่อนไขเพื่อให้หยุดการรับข้อความ
			if(word.equalsIgnoreCase("stop")) {
				System.out.println("Program Terminate");
				break;
				
			}
			//การรวมข้อความที่ป้อนเข้ากัน
			txtConcate+=word+" ";
			
		} //end while()
		System.out.print(txtConcate.toUpperCase());
		
		
		kb.close();
	}

}
