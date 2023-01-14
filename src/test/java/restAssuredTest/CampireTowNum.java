package restAssuredTest;

import java.util.Scanner;

public class CampireTowNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Num");
		int num1 = s.nextInt();
		System.out.println("Enter Secod Num");
		int num2 = s.nextInt();
		s.close();
		if(num1 > num2)
		{
			System.out.println("First no is grater = "+num1);
		}
		
		else if(num2 > num1)
		{
			System.out.println("Second no is grater = "+num2);
		}
		
		else 
		{
			System.out.println("Both no are equal");
		}
		

	}

}
