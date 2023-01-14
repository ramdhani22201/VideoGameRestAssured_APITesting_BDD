package restAssuredTest;

public class findTheDuplicatesOfGivenString {

	public static void main(String[] args) {
		String str = "Ram and ap ram";
		String[] arr = str.split(" ");
		for(String s : arr)
		{
			System.out.println(s);
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i].equalsIgnoreCase(arr[j]))
				{
					System.out.println(arr[i]+"   "+j);
					
				}
			}
		}

	}

}
