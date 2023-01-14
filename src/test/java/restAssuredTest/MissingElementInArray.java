package restAssuredTest;

public class MissingElementInArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,6};
		int sumWithoutMissing =0;
		int sumMissingElement =0;
		
		for(int i=1; i<=6; i++)
		{
			sumWithoutMissing =sumWithoutMissing +i;
		}
		System.out.println(sumWithoutMissing);
		
		for(int i=0; i<=arr.length; i++)
		{
			sumMissingElement = sumMissingElement + i;
		}
		System.out.println(sumMissingElement);
		
		System.out.println(sumWithoutMissing - sumMissingElement + " Missing Element");
		

	}

}
