package restAssuredTest;

public class TwoArrayBothAreEqualsORnotWithoutPridifineMethod {

	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4};
		int [] arr2 = {1,3,2,4};
		int arr1Len = arr1.length-1;
		int arr2Lin = arr2.length-1;
		boolean campatizion = true;
		if(arr1Len == arr2Lin)
		{
			for(int i=0; i<arr1Len; i++)
			{
				if(arr1[i] != arr2[i])
				{
					campatizion = false;
				}
			}
		}
		else
		{
			campatizion = false;
		}
		if(campatizion == true)
		{
			System.out.println("Both Array Equal");
		}
		else
		{
			System.out.println("Not Equal both ");
		}

	}

}
