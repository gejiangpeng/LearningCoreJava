package Chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jpIn = new Scanner(System.in);
		
		System.out.println("Please input total numbers:");
		int jpTotalNumbers=jpIn.nextInt();
		System.out.println("Please input total numbers:");
		int jpDrawNumbers=jpIn.nextInt();
		
		int[] jpTotalArrays = new int[jpTotalNumbers];
		int[] jpDrawArrays = new int[jpDrawNumbers];
		
//generate total numbers array
		for(int i=0; i<jpTotalArrays.length; i++) {
			jpTotalArrays[i]=(i+1);
		}
		
//draw numbers and put into jpDrawArrays
		for(int i=0; i<jpDrawArrays.length; i++) {
			int jpRandom = (int) (Math.random()*jpTotalArrays.length);
			System.out.println("random seed is:"+jpRandom);
			jpDrawArrays[i]= jpTotalArrays[jpRandom];
			jpTotalArrays[jpRandom]=jpTotalArrays[jpTotalArrays.length-1];
			jpTotalArrays = Arrays.copyOf(jpTotalArrays, jpTotalArrays.length-1);
		}
		System.out.println("Numbers drawed are:");
		for(int i:jpDrawArrays) {
			System.out.println(i);
		}
		
		jpIn.close();
	}
}
