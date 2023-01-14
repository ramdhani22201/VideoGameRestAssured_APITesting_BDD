package restAssuredTest;

public class ReverseArray {

	public static void main(String[] args) {
		char [] chArr = {'a','b','c','d'};
		char revChar ;
		for(int i=chArr.length-1; i>=0; i--)
		{
			revChar = chArr[i];
			System.out.println(revChar);
		}

	}

}
