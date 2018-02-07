package Chapter3;

import java.util.*;

public class continueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jpInt = new Scanner(System.in);
		int i=0;
		while(i<100) {
			System.out.println("value of i is:"+i);
			int n=0;
			if(i==0) {
				System.out.println("Input -1 to exit:");
				n = jpInt.nextInt();
			}
			if(n<0) continue;
			i++;
		}		
		System.out.println("Test Over");
		jpInt.close();
	}

}
