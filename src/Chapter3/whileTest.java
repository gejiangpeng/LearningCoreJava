package Chapter3;

import java.util.*;

public class whileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much do you want to prepare for the retirement:");
		double jpTarget = in.nextDouble();
		
		System.out.println("How much can you save for one year:");
		double jpContribute = in.nextDouble();
		
		System.out.println("What is the bank rate:");
		double jpBankRate = in.nextDouble();
		
		int jpYears = 0;
		double jpNowDeposit =0.0;		
		while(jpNowDeposit < jpTarget) {
			jpNowDeposit *= (1+jpBankRate);
			jpNowDeposit +=jpContribute;
			jpYears ++;
		}
		
		System.out.printf("You need %d years to prepare for the retirment.",jpYears);
	}

}
