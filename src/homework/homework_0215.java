package homework;

public class homework_0215 {

	public static void main(String[] args) {
		String word1 = "reboot";
		// String word2= "Snowing";
		String firstTwo = word1.substring(0, 2);
		System.out.println(word1.substring(2) + firstTwo);

		// TODO Auto-generated method stub

	}

}

/*
 * Given these string, "Reboot" and "Snowing" return a "rotated left 2" version
 * where the first 2 chars are moved to the end.
 * 
 * expected results : bootRe owingSn
 */