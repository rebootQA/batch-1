package homework;

public class homework_0219 {

	public static void main(String[] args) {
		String word= "reboot";
		int index=0;
		if (word.length()>=2 && word.length()<=3) {
			System.out.println(word.substring(index,index+2));
		}else {
			System.out.println(word.substring(0,2));
		}
		
		// TODO Auto-generated method stub

	}

}

/*
 * Given a string 
 * ("reboot", "CodingBat", "Java")
 * and an index, 
 * (0,5,3)
 * return a string length 2 starting at the given index.
 
 * (reboot,0) ==> re
 * (CodingBat,5) ==> gB
 * (Java,3) ==> Ja
 
 // hint : java length = 4
 // check if index is = 4 
 // create int variable for index / create string variable words.
 
 * If the index is too big or too small to define a string length 2, use
 * the first 2 chars. The string length will be at least 2.
 */