package homework;

public class homework_0214 {

	public static void main(String[] args) {
		String a = "aaa";
		String b = "b";

		if (a.length() > b.length()) {
			System.out.println(b + a + b);
			System.out.println(""+b.length() + a.length()+ b.length());
		} else {
			System.out.println(a + b + a);
			System.out.println(a.length() + "" + b.length() + a.length());

		}

	}

}

/*
 * Given these strings, "reboot" and "homework", "aaa" and "b"
 * 
 * return a string of the form short+long+short, with the shorter string on the
 * outside and the longer string on the inside. The strings will not be the same
 * length, but they may be empty (length 0).
 * 
 * IF STATEMENTS MUST BE USED
 */