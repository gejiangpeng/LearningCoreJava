package Chapter3;
import java.io.Console;
import java.util.*;

public class ConsoleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please input your name:");
		String name = in.nextLine();
		
		System.out.println("Please input your age:");
		int age = in.nextInt();
		
		System.out.println("Please input the rate:");
		
//		System.out.println("Please input a sentence:");
//		String word = in.next();
		
		Console con = System.console();
		System.out.println("Please input password:");
		char[] passwd = con.readPassword("Password :");
		
		System.out.println("Hell "+name+", next year you will be "+(age+1));
//		System.out.println("the rate is "+rate+" and your word is:"+ word);
		System.out.println("password is: "+String.valueOf(passwd));
		System.out.println("check whether next:"+ in.hasNext());
		
		in.close();
	}

}
