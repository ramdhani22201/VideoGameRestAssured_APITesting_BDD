package restAssuredTest;

public class RemoveTheSpacesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ram teh  am am drham tham";
		String s1 = s.replaceAll("\\s", "");
		System.out.println(s1);
	}

}
