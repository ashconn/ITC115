//*******************************************************************
// Ch4 Example 3
// season
//
// Method repl takes two integers as parameters to represent a month
// and day and returns a string indicating the season for the parameters.
// Empty or less than zero parameters will result in an empty string.
//
// By: Ashley Connolley
// Oct 27 2019
//***

package assign5;

public class Part1 {

	public static void main(String[] args) {
		System.out.println(season(6, 16));

	}

	public static String season(int month, int day) {
		if((month >= 9 && month <= 12) && (day == 16||day == 15))
			return "Fall";
		else if((month >= 6 && month <= 9) && (day == 16||day == 15))
			return "Summer";
		else if((month >= 3 && month <= 6) && (day == 16||day == 15))
			return "Spring";
		else
			return "Winter";
	}
	
}
