package homework;

public class homework_0215 {

	public static void main(String[] args) {

		String a = "Reboot";
		String b = "Snowing";
//		String lastA = a.substring(2);
//		String lastB = b.substring(2);
//		String firstTwoA = a.substring(0, 2);
//		String firstTwoB = b.substring(0, 2);
//		
//		System.out.println(lastA + firstTwoA);
//		System.out.println(lastB + firstTwoB);

		System.out.println(a.substring(2) + a.substring(0, 2));
		System.out.println(b.substring(2) + b.substring(0, 2));

	}



		}
		
/*
 * Given these string, "Reboot" and "Snowing" return a "rotated left 2" version
 * where the first 2 chars are moved to the end.
 * 
 * expected results : bootRe owingSn
 */