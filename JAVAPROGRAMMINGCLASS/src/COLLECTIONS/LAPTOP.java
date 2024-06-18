package COLLECTIONS;

public class LAPTOP {
	String brand;
	double price;
	String colour;
	LAPTOP()
	{
	}
	public LAPTOP(String brand, double price, String colour) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "LAPTOP [brand=" + brand + ", price=" + price + ", colour=" + colour + "]";
	}
	

}
