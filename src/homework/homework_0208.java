package homework;

public class homework_0208 {
	public static void main(String[] args) {

		String[] reboot = { "t", "o", "o", "b", "e", "r" };

		for (String letters : reboot) {
			if (letters.contains("r")) {
				for (int i = reboot.length - 1; i >= 0; i--) {
					System.out.print(reboot[i]);
				}
			}
		}

	}

}

// Write me a loop that will print this array in reverse
// {t, o, o, b, e, r}
// check if the array has a letter "r" in it.
