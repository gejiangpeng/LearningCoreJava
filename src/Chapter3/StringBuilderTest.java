package Chapter3;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder myStringBuilder = new StringBuilder();
		myStringBuilder.append("First");
		myStringBuilder.appendCodePoint(97);
		myStringBuilder.setCharAt(3, (char) 74);
		myStringBuilder.delete(0, 2);
		myStringBuilder.insert(2, "JP");
		
		String myOutString = myStringBuilder.toString();
		System.out.println(myOutString);
	}

}
