package restAssuredTest;

public class A2b3c4AOutputabbbcccc {

	public static void main(String[] args) {
		String s = "a2b3c4";
		
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				//System.out.print(s.charAt(i));
			}
			else
			{
				int a = Character.getNumericValue(s.charAt(i));
				for(int j=0; j<a; j++)
				{
					System.out.print(s.charAt(i-1));
				}
			}
		}
		String s1 = "RamdDnadD";
		
		System.out.println();
		System.out.println(s1.replace('a','$'));
		
	}

}
