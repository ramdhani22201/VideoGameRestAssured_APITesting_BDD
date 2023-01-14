package restAssuredTest;

public class RemoveSpecialCharAndSpacesFromString {

	public static void main(String[] args) {
		String s = "35%42&*fam ra, 645 raj";
		String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);

	}

}
