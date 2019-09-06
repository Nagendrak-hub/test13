package javaPack1;

public class PrintText {
	String s = "Hi to every to every one";

	void test() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(s);
			if (i == 100) {
				System.out.println("Printed value = " + i);
			}
		}
	}

	public static void main(String[] args) {
		PrintText pt = new PrintText();
		pt.test();
	}
}
