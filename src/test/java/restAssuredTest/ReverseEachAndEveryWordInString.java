package restAssuredTest;

public class ReverseEachAndEveryWordInString {

	public static void main(String[] args) {
		String str = "My Name is Ramdhani";
		String[] arr = str.split(" ");
		String rev = "";
		for(String s : arr)
		{
			String revWord = "";
			for(int i=s.length()-1; i>=0; i--)
			{
				revWord= revWord + s.charAt(i);
			}
			rev = rev + revWord + " ";
		}
		System.out.println(rev);

	}

}
