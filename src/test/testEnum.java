package test;

public class testEnum{	
	public static void main(String[] args) {
		ColorTest color= ColorTest.BLUE;
		switch(color) {
		case BLUE:
			System.out.println("Color is Blue");
			System.out.println(color.ordinal());
			break;
		case GREEN:
			System.out.println("Color is Green");
			break;
		case RED:
			System.out.println("Color is Red");
			break;
		}
	}
}

enum ColorTest{
	RED, BLUE, GREEN
}