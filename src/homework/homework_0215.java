package homework;

public class homework_0215 {

	public static void main(String[] args) {
		// TODO Auto-generated method s

		String a ="Reboot";
		 String b ="Snowing";
		 String firsttwo=a.substring(0,2);
		 String left=a.substring(2,a.length());
		 String firsttwob=b.substring(0,2);
		 String leftb=b.substring(2,b.length());
		 System.out.println(left+firsttwo);
		 System.out.println(leftb+firsttwob);
			}

		}
/*
 * Given these string,
 * "Reboot" and "Snowing"
 * return a "rotated left 2" version where the first 2 chars are
 * moved to the end. 
 * 
 * expected results :
 * bootRe
 * owingSn
 */