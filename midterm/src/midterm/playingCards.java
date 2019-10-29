//*******************************************************************
// Midterm Assignment
// Ch4 Example S14
//
// This program reads a shorthand text description of a playing card
// and prints the longhand equivalent. It assumes user types valid input.
// Ranks: 2-10, J, Q, K, A
// Suits: C, D, H, S
//
// By: Ashley Connolley
// Oct 28 2019
//***

package midterm; 

public class playingCards {

	//main is the test for the method
	public static void main(String[] args) {
		card("6", "S");
	}
	
	//convert shorthand rank to written out form
	public static void card(String rank, String suit) {
		if (rank == "2") {
		    System.out.print("Two of ");
		} else if (rank == "3") {
		    System.out.print("Three of ");
		} else if (rank == "4") {
		    System.out.print("Four of ");
		} else if (rank == "5") {
		    System.out.print("Five of ");
		} else if (rank == "6") {
		    System.out.print("Six of ");
		} else if (rank == "7") {
		    System.out.print("Seven of ");
		} else if (rank == "8") {
		    System.out.print("Eight of ");
		} else if (rank == "9") {
		    System.out.print("Nine of ");
		} else if (rank == "10") {
		    System.out.print("Ten of ");
		} else if (rank == "J") {
		    System.out.print("Jack of ");
		} else if (rank == "Q") {
		    System.out.print("Queen of ");
		} else if (rank == "K") {
		    System.out.print("King of ");
		} else if (rank == "A") {
		    System.out.print("Ace of ");
		}
		
	//convert shorthand suit to written out form
		if (suit == "C") {
		    System.out.print("Clubs");
		} else if (suit == "D") {
		    System.out.print("Diamonds");
		} else if (suit == "H") {
		    System.out.print("Hearts");
		} else if (suit == "S") {
		    System.out.print("Spades");
		}
	}
}