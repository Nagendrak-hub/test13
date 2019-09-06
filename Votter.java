package javaPack1;

import java.util.Scanner;

public class Votter {
	Scanner s = new Scanner(System.in);

	void test() {
		System.out.println("Enter A value");
		int a = Integer.parseInt(s.nextLine());
		System.out.println("Enter A value");
		int b = Integer.parseInt(s.nextLine());
		if (a > b) {
			System.out.println("Person is elgible for Voter ID");
		} else {
			System.out.println("Person is wait until" + (a - b) + "years");
		}
	}

	public static void main(String[] args) {
		Votter vt = new Votter();
		vt.test();
	}
}
