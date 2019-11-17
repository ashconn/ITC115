//*******************************************************************

//  isSorted
//	This method accepts an Array of real numbers as a parameter
//  and returns True if the list is sorted (nondecreasing) order
//  and returns False otherwise.
// 
//	By: Ashley Connolley
//	Date: 11/17/2019
//
//****

package assign8;

public class Exercise4 {

	public static void main(String[] args) {
		//These are the lists that will be checked using the method
		double[] array1 = {16.1, 12.3, 22.2, 14.4};
		double[] array2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		//This is the output after completing the isSorted method
		System.out.println("isSorted returns: " + isSorted(array1));
		System.out.println("isSorted returns: " + isSorted(array2));
	}

public static boolean isSorted(double[] list) {
	//This method does the work of checking if the list is ascending
	double value1 = 0.0;
	int counter = 0;
	for (double a : list) {
		if (counter > 0) {
			if (value1 > a) {
				//Not ascending
				return false;
				}
		}
			value1 = a;
			counter ++;
			}
		return true;
	}
}