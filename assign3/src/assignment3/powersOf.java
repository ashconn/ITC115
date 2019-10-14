package assignment3;

public class powersOf {

	public static void main(String[] args) {
		printPowersOfN(2,7);
		printPowersOfN(5,3);
	}
	
	public static void printPowersOfN(int base, int exp) {
		for(int i = 0; i <= exp; i++)
		System.out.print(((int) Math.pow(base, i)) + " ");
		System.out.println("\n");
	}
}
