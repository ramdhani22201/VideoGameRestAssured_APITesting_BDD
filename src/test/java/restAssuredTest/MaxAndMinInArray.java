package restAssuredTest;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {10,3,4,5,343,4,65,};
		int max =arr[0];
		int min =arr[0];
		for(int i =0; i<arr.length-1; i++)
		{
			if(max < arr[i])
			{
				
				max = arr[i];
			}
			
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println("Maximam = "+max);
		System.out.println("Minimam = "+min);
	}

}
