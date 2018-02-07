package Chapter3;
/*this is a lottery program, user will pick 60 balls from 490 balls,
 * and this program will tell you the odds 
 */

import java.math.*;

public class BigNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jpPickedBalls = 60;
		int jpTotalBalls = 490;
		BigInteger jpOdds = BigInteger.valueOf(1);
		
		for(int i=1; i<jpPickedBalls; i++) {
			jpOdds = jpOdds.multiply(BigInteger.valueOf(jpTotalBalls-i+1).divide(BigInteger.valueOf(i)));
		}
		System.out.println("the odds is:"+BigDecimal.valueOf(1).divide(BigDecimal.valueOf(jpOdds.longValue()), 30, RoundingMode.HALF_UP));
	}

}
