package homework;

public class homework_0226 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i + " fizzbuzz");
			} else if (i % 3 == 0) {
				System.out.println(i + " fizz");
			} else if (i % 5 == 0) {
				System.out.println(i + " buzz");
			} else {
				System.out.println(i);
			}
		}

	}
}

/*
 * write a program that returns "fizz" if the number is a multiplier of 3,
 * return "buzz" if its multiplier of 5, and return "fizzbuzz" if the number is
 * divisible by both 3 and 5.
 */
