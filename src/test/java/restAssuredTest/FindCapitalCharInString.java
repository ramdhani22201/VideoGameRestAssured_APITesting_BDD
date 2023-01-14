package restAssuredTest;

public class FindCapitalCharInString {

	public static void main(String[] args) {
		String s = "My name is Ramdhani Chauhan";
		char[] charArr = s.toCharArray();
		int count =0;
		for(char c : charArr)
		{
			if(c >= 'A' && c<='Z')
			{
				count++;
				System.out.print(c );
				
			}
		}
		System.out.println("   "+count);

	}

}
