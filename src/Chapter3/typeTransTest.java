package Chapter3;
public class typeTransTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 9.87;
		long y = 2;
		int z = 5;
		
		int nx = (int) x;
		long rx = Math.round(x);
		int rnx = (int) Math.round(x);
		
		System.out.println("x+ y="+ (x+y));
		System.out.println("z+y="+(z+y));
		System.out.println("nx is:"+nx);
		System.out.println("rx is:"+rx);
		System.out.println("rnx is:"+rnx);
		z += 3.55;
		System.out.println("Z+ = "+z);
	}

}
