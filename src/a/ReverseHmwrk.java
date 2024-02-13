package a;

public class ReverseHmwrk {
	public static void main(String[] args) {
		String[] letters = { "r", "e", "b", "o", "o", "t" };
		boolean isIt = false;
		String findLetter = "r";

		for (int i = 0; i <= letters.length / 2 - 1; i++) {
			if (letters[i].equals(findLetter)) {
				isIt = true;
				System.out.println("Does this Array have the letter" + findLetter + "?" + isIt);
			}
			String front = letters[i];
			String back = letters[letters.length - 1 - i];
			letters[i] = back;
			letters[letters.length - 1 - i] = front;
		}
		System.out.println(Arrays.toString(letters));

	}

}
