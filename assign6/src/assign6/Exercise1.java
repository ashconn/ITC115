//*******************************************************************

//  boyGirl
//	This method accepts a Scanner which receives its input from a file containing arrays
//	that have names followed by integers and computes the absolute difference between the
//	sum of the boy names' integers and girl names' integers.
// 
//	By: Ashley Connolley
//	Date: 11/12/2019
//
//****

package assign6;

import java.io.*;
import java.util.*;

public class Exercise1 {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("boysgirls.txt"));
		boyGirl(input);
		}
	public static void boyGirl(Scanner in) {
		int boyCount = 0;
		int boySum = 0;
		int girlCount = 0;
		int girlSum = 0;
		int count = 0;
		int sumDiff = 0;
		
		while(in.hasNext()) {
			if(count % 2 == 0) {
				boyCount++;
				boySum += readInfo(in);
			} else {
				girlCount++;
				girlSum += readInfo(in);
			}
			count += 1;
		}
		sumDiff = Math.abs(boySum-girlSum);
		System.out.println(boyCount + " boys, " + girlCount + " girls.");
		System.out.println("Difference between boys' and girls' sums: " + sumDiff);
}
	public static int readInfo(Scanner in) {
		String name = in.next();
		int num = in.nextInt();
		return num;
	}
}