//*******************************************************************
//  Ch4 Example 2
//  repl
//
// Method repl accepts string and number of repetitions as parameters and
// returns the string concatenated that many # of times.
//
//By: Ashley Connolley
//Oct 22 2019
//***


package assign4;

public class Repeat {

	public static void main(String[] args) {
		System.out.println(repl("l8rAsh", 2));

	}

	public static String repl(String a, int n) {
		String value = "";
		for (int i = 1; i <= n; i++) {
			value = value + a;
		}
		return value;
	}
	
}
