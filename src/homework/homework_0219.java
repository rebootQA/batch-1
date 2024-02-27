package homework;

public class homework_0219 {

	public static void main(String[] args) {

		String words = "Java";
		int index = 3;

		if (words.length() <= index + 1) {
			System.out.println(words.substring(0, 2));
		} else {
			System.out.println(words.substring(index, index + 2));
		}
	}
	// j a v a
	// 0 1 2 3 <== index
	// 1 2 3 4 <== length

	// find the max index = length - 1
	// 3 = 4 - 1
	// find the max length = index + 1
	// 4 = 3 + 1
	// index = 3

}

/*
 * Given a string ("reboot", "CodingBat", "Java") and an index, (0,5,3) return a
 * string length 2 starting at the given index.
 * 
 * (reboot,0) ==> re (CodingBat,5) ==> gB (Java,3) ==> Ja
 * 
 * // hint : java length = 4 // check if index is = 4 // create int variable for
 * index / create string variable words.
 * 
 * If the index is too big or too small to define a string length 2, use the
 * first 2 chars. The string length will be at least 2.
 */