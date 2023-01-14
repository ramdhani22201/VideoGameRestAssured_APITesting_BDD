package restAssuredTest;

public class IndexOfDemo {

	public static void main(String[] args) {
		String s = "ss ram dd adffffsi ram";
		String ss="";
		
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(ss.indexOf(c)==-1)
			{
				ss=ss+c;
				
			}
		}
		System.out.println(ss);
		System.out.println(s.indexOf("ram", 8));
	
	}

}
