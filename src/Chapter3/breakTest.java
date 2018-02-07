package Chapter3;

public class breakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		label_break:
		while(i<100) {
			System.out.println("value of i is:"+i);
			for(int j=0;j<100;j++) {
				System.out.println("value of j is:"+j);
				if(j>i) {
					break label_break;
				}
			}
		}

		System.out.println("Running is over");
	}

}
