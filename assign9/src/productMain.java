public class productMain {

	public static void main(String[] args) {
		
		//create instances of the objects
		
		productData p1 = new productData("Apples", "Fuji", 1244, 1);
		productData p2 = new productData("Oranges", "Cuties", 2344, 1);
		productData p3 = new productData("Chips", "Pringles", 3444, 3);
		
		//print out the object instances
		//show the total product count
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		int count = productData.count;
		System.out.println("How many products? " + count);
		
	}
}