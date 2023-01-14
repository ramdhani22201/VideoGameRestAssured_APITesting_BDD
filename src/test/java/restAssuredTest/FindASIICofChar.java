package restAssuredTest;

import java.util.Scanner;

public class FindASIICofChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Char");
		 char ch = s.nextLine().charAt(0);
		 int  ascii = (int) ch;
		 s.close();
		 System.out.println("Ascii value = "+ascii);
	}

}
