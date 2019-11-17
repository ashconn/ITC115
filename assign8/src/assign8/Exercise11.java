//*******************************************************************

//  isUnique
//	This method accepts an Array of integers as a parameter
//  and returns a boolean indicating whether or not  the values in
//  the array are unique. Unique meaning there are no repeats/pair of
//  values that are equal.
// 
//	By: Ashley Connolley
//	Date: 11/17/2019
//
//****

package assign8;

public class Exercise11 {

	public static void main(String[] args) {
		//These are the lists that will be checked using the method
		int[] array1 = {3, 8, 12, 2, 9, 17, 43, -8, 46};
		int[] array2 = {4, 7, 3, 9, 12, -47, 3, 74};
		//This is the output after completing the isSorted method
		System.out.println("array1 returns: " + isUnique(array1));
		System.out.println("array2 returns: " + isUnique(array2));
	}

	public static boolean isUnique(int[] a) {
	//This method does the work of checking if the list is unique
		for(int i = 0; i < a.length; i++) {
			for(int b = i + 1; b < a.length; b++) {
				if(a[i] == a[b]) {
					return false;
				}
			}
		}
		return true;
	}

}