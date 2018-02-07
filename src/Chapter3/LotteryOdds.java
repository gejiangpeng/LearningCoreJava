package Chapter3;
/*


*/
import java.util.*;

public class LotteryOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jpIn = new Scanner(System.in);
		System.out.println("Please input lottery numbers you will pick:");
		int jpLotteryCounts = jpIn.nextInt();
		
		System.out.println("Please input total lottery options:");
		int jpLotteryOptions = jpIn.nextInt();
		
		int jpLotteryOdds = 1;
		for(int i=1;i<jpLotteryCounts;i++) {
			jpLotteryOdds = jpLotteryOdds*(jpLotteryOptions-i+1)/i;
		}
		
		System.out.println("Lottery Odds is:"+jpLotteryOdds);
		
		jpIn.close();
	}

}
