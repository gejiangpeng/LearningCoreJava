package Chapter3;

import java.util.Date;

public class SystemOutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 10000.0/3.0;
		System.out.printf("divided result is %8.2f",x);
		
		String text = "divided";
		System.out.printf("\n%s result is %+,10.2f", text, (0-x));
		
		String sentence = String.format("\n%s result is %+,10.2f", text, (0-x));
		System.out.println(sentence);
		
		System.out.printf("now time is %tc", new Date());
		System.out.printf("\n%1$s %2$tY %2$tB %2$te %2$tA", "Now time is", new Date());
		System.out.printf("\n%s %tY %<tB %<te %<tA", "Now time is", new Date());
	}

}
