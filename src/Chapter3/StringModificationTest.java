package Chapter3;

public class StringModificationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
//equalsIgnoreCase
		if(s.equalsIgnoreCase("hello")) {
			System.out.println("PASS of Equal ignore CASE");
		}else {
			System.out.println("Fail of equal");
		}
//compareTo Test
		int testResult;
		testResult = s.compareTo("OK");
		
		if(testResult < 0) {
			System.out.println("Hello is greater than OK");
		}
		else if(testResult == 0) {
			System.out.println("Hello is equal than OK");
		}
		else if(testResult > 0) {
			System.out.println("Hello is lesser than OK");
		}
//Codepoint
		String greeting = "how are you";
		int n = greeting.length();
		
		int cnCount = greeting.codePointCount(0, n);
		
		System.out.println("string length"+n);
		System.out.println("Code point numbers:"+cnCount);
		
		System.out.println("char at 3 is:"+greeting.charAt(2));
//get code point of xxx
		String codeString = "abcABC";
		int i = 0;
		int index = codeString.offsetByCodePoints(0,i);
		System.out.println("offset of 0, i:"+index);
		int cp = codeString.codePointAt(index);
		System.out.println("get code point:"+cp);
		
		int index2 = codeString.offsetByCodePoints(0, 3);
		int cp2 = codeString.codePointAt(index2);
		System.out.println("offset:"+index2);
		System.out.println("code point:"+cp2);
		System.out.println("char At offset of index2:"+codeString.charAt(index2));

//went through a string
		String sentence = "go through all charaters of a string";
		int[] codePoints = sentence.codePoints().toArray();
		System.out.println("sentence code points array:"+codePoints);
		for(int j=0;j<codePoints.length;j++) {
			System.out.println(codePoints[j]);
			System.out.println("Char at code point is:"+(char)codePoints[j]);
		}
		byte[] b=new byte[50];
//		byte[] b={};
		for(int k=0;k<codePoints.length;k++) {
			b[k]=(byte)codePoints[k];
			System.out.println(b[k]);
		}
		System.out.println("the oringinal String is:"+ new String(b));
	}
	
}
