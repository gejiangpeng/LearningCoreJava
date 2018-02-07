package Chapter3;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		String s = str.substring(0,2);
		String s2 = str.replace("l", "s");
		
		System.out.println(s);
		System.out.println(s2);
		
		String mjoin = String.join("-", s, s2);
		System.out.println(mjoin);
		
		if(str.equals("Hello")) {
			System.out.println("test pass");
		}
		
		int n = str.length();
		System.out.println("lenght of str is:"+n);
		
		int index = str.indexOf(97, 0);
		System.out.println(index);
		index = str.indexOf("e", 0);
		System.out.println(index);
	}

}
