package restAssuredTest;

public class HowManyTimeComeParticularCharInString {

	public static void main(String[] args) {
		String str = "My name is Ramdhani chauhan";
		char [] cArr = str.toCharArray();
		char u = 'n';
		int count =0;
		for(char cch : cArr)
		{
			if(cch == u)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
