package restAssuredTest;

public class LowestNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {5,6,3,6,3,1,34};
		int min =0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]< arr[j])
				{
					min = arr[i];
				}
			}
			
		}
		System.out.println(min);
	}

}
