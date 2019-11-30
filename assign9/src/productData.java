import java.text.NumberFormat;

// A product data object

public class productData {
	public static int count;
	
	private String name;
	private String description;
	private double price;
	private int code;

	public productData(String name, String description, int code, int price) {
		this.name = name;
		this.description = description;
		this.code = code;
		this.price = price;
		
		count++;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getCode() {
		return code;
	}
	
	public String getPriceFormatted() 
    {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
        return formattedPrice;
    }
	
	public String toString() {
	    return name + " " + "Description: " + description + " " + "Code: " + code + " " + price;
	 }
}