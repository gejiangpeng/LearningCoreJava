package Chapter3;

public class BitwiseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		int fourthBitFromRight = (n&0b10000)/0b10000;
		
		System.out.println(fourthBitFromRight);
		System.out.println("n >> 2: "+(n>>2));
	}

}
