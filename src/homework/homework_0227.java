package homework;

public class homework_0227 {

	public static void main(String[] args) {
		int [] a = {1,2,3};
		int [] b = {1,3};
		
		if((a[0] == b[0]) || (a[a.length-1] == b[b.length-1])){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		

	}

}
/*
 * Given 2 arrays of ints, a and b, return true if they have the same first
 * element or they have the same last element. 
 * ([1, 2, 3], [7, 3]) 	  ==> true
 * ([1, 2, 3], [7, 3, 2]) ==> false
 * ([1, 2, 3], [1, 3])	  ==> true
 */