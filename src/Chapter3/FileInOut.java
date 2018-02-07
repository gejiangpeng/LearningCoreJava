package Chapter3;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

//import java.util.Scanner;

public class FileInOut{

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String jpPath = System.getProperty("user.dir");
		System.out.println("user dir is:"+jpPath);
		
		Scanner in = new Scanner(Paths.get(jpPath+"\\"+"src\\Chapter3\\FileInOut.java"),"UTF-8");
		System.out.println(in.nextLine());
		System.out.println(in.next());
		in.close();
		
		PrintWriter out = new PrintWriter((jpPath+"\\"+"src\\Chapter3\\text.txt"),"UTF-8");
		out.write("this is write test");
		out.write("\rn this is the first try");
		out.close();
		PrintWriter out2 = new PrintWriter((jpPath+"\\"+"src\\Chapter3\\text.txt"),"UTF-8");
		out2.write("test for the second try");
		out2.close();
	}

}
