package javaPack;

public class MainMethod {
	void test1() {
		System.out.println("I am from Instance1");
		test2();
	}

	void test2() {
		// test1();
		System.out.println(":I am from Instance2");

	}

	static void test3() {
		MainMethod mm = new MainMethod();
		mm.test1();
		System.out.println("I am from static3");
		test4();
	}

	static void test4() {
		System.out.println("I am from static4");
	}

	public static void main(String[] args) {
		System.out.println("Have a nice day");
		test3();

	}
}
