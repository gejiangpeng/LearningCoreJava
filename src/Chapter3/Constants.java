package Chapter3;
public class Constants {
	public static void main(String[] args) {
		final double CM_PER_INCH = 2.4;
		double paperwidth = 8.5;
		double paperheight = 11;
		System.out.println("Paper size in centimeters: "+ paperwidth*CM_PER_INCH + " by " + paperheight*CM_PER_INCH);
	}
}
