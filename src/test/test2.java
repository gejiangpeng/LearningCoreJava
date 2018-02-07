package test;
public class test2{
	private int a;
	private int b;
	private int c;
	public test2(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public boolean check() {
		if(a>b) return false;
		if(b>c) return false;
		System.out.println("test");
		return a<b;
	}
}