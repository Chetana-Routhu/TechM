package javaProgram;

public class MethodOverLoading {
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		add(10,20);
		add(19,29,39);

	}

}
