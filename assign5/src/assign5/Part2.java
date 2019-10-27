//*******************************************************************
// Ch4 Example 10
// printGPA
//
// Method accepts a Scanner for the console as a parameter and
// calculates a student's GPA.
//
// By: Ashley Connolley
// Oct 27 2019
//***

package assign5;

import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		printGPA(console);
	}
	public static void printGPA(Scanner input) {
		double sum = 0.0;
		System.out.print("Enter a student record: ");
		String name = input.next();
		int numScore = input.nextInt();
		for (int i = 0; i < numScore; i++) {
			sum += input.nextInt();
		}
		double avg = sum/numScore;
		System.out.println(name + "'s grade is " + avg + ".");
	}
}
