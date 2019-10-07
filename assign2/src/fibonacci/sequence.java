// Assignment 2 (book pg 133 exercise 3)
// Print first 12 Fibonacci number sequence

package fibonacci;

public class sequence {

		public static void main(String[] args) {
			// Set variables
			int a = 1;
			int b = 1;
			int c;
			
			for(int i = 1; i<=12 ; i++) {
				System.out.print(a+" ");
				c = a+b;
				a=b;
				b=c;
			}
		}
}