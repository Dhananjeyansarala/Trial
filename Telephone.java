package OopsTest;

public class Telephone {
	private String brand;
	private int price;
	private String color;
	private boolean isWireless;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean getWireless() {
		return isWireless;
	}
	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
	public Telephone(String brand, int price, String color, boolean isWireless) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.isWireless = isWireless;
	}
	public String toString() {
		return "Telephone [brand=" + brand + ", price=" + price + ", color=" + color + ", isWireless=" + isWireless
				+ "]";
	}
	
	
	

}
