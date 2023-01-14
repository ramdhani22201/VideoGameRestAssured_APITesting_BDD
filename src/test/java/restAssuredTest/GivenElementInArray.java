package restAssuredTest;

import java.util.Arrays;

public class GivenElementInArray {

	public static void main(String[] args) {
		int []arr = {10,5,4,5,343,4,65,};
		int k = 5;
		Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));
		boolean found = false;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == k)
			{
				found=true;
				break;
			}
			
		}
		if(found == true)
		{
			System.out.println("Given element is present in Array = "+k);
		}
		else
		{
			System.out.println("not present in Array");
		}
			

	}

}
