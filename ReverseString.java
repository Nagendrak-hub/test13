package javaPack;

public class ReverseString {
	static String s = "Hi have a nice day";

	public static void main(String[] args) {
		StringBuffer st = new StringBuffer(s);
		System.out.println(st.reverse());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.trim());
		System.out.println(s.replaceAll("\\s", ""));
	}
}