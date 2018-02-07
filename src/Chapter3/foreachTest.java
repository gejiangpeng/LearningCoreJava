package Chapter3;

import java.util.Arrays;

public class foreachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] jpArray = new int[10];
		jpArray = new int[] {1,2,11,4,5,6,7,8,9,10};
		int[] jpCopyArray = jpArray;
		jpCopyArray[0]=0;
		
		for(int element:jpArray) {
			System.out.println(element);
		}
		int[] jpArrayCopy = Arrays.copyOf(jpArray, 2*jpArray.length);
		Arrays.sort(jpArrayCopy);
		for(int i=0; i<jpArrayCopy.length; i++) {
			System.out.println(jpArrayCopy[i]);
		}
	}

}
